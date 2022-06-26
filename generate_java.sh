#!/bin/bash

value=""

if [ -n $1 ]
    then
        mkdir uri_$1
        touch uri_$1/Main.java
	    cat Main.java > uri_$1/Main.java
	    code uri_$1/Main.java
    else
        echo "Entre com o parâmetro"
fi
