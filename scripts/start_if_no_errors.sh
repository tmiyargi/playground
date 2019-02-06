#!/bin/bash

MANAGEMENT_PORT=9990
running=false

if [ "$1" != "" ]; then
    MANAGEMENT_PORT=$1
fi

nohup ./standalone.sh --server-config=standalone-picketlink.xml >/dev/null 2>&1 &
echo 'Stating server'

for i in $(seq 1 30);  #check if the port is ready if given the right port
do  
    sleep 1
    if netstat -an | grep $MANAGEMENT_PORT | grep LISTEN
        then
        echo 'Management interface ready'
        running=true
        break
    fi
done

while $running  #check if the server start success
do  
    if ./jboss-cli.sh --connect command=':read-attribute(name=server-state)' | grep running
    then
        boot_errors=`./jboss-cli.sh --connect command='/core-service=management:read-boot-errors()'`
        if [[ $boot_errors == *"fail"* ]];
        then
           echo 'Shutting down the server due to errors'
           echo $boot_errors
           ./jboss-cli.sh --connect command='shutdown'
           echo 'Server stopped'
        else
            echo 'Server started'
        fi
        break
    fi
    sleep 1
done
