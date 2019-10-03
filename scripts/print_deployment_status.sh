#!/bin/bash

JBOSS_CLI='path to/jboss-cli.sh'

print_deployment_status(){
	CLI_COMMAND="${JBOSS_CLI} -c "
	echo ""
	echo "********** Check application status **********"
	date
	echo ""
	HOSTS=$(${CLI_COMMAND} -c --command="ls /host")
	for host in ${HOSTS}; do
        	SERVERS=$(${CLI_COMMAND} -c --command="ls /host=${host}/server")
	        for server in ${SERVERS}; do
	        	APPLICATIONS=$(${CLI_COMMAND} -c --command="ls /host=${host}/server=${server}/deployment")
	        		for application in ${APPLICATIONS}; do 
                    	STATUS=$(${CLI_COMMAND} -c --command="ls /host=${host}/server=${server}/deployment=${application}:read-attribute(name=status)" | grep status)
	                	echo "${host}/${server}/${application} ${STATUS}"
	                done
    		done
	done
	echo ""
	echo "********** End of script **********"
	date
	echo ""
}

print_deployment_status