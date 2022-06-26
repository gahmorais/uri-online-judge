#!/bin/bash

if [ -n $1 ] 
    then
    [ ! -d "uri_$1" ] && mkdir uri_$1
        touch uri_$1/main.c
        cat main.c > uri_$1/main.c
        code uri_$1/main.c
    else
        echo "Entre com o parâmetro"
fi
