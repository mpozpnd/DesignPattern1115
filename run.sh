#bin/bash

if [ $# -lt 1 ]; then
    echo "Usage: $CMDNAME [chap9 | chap10 | exe1 | exe2] 'arg1 arg2 arg3...' "
    exit 1
fi

if [ $1 == 'chap9' ]; then
    cd chap9/src/main/java
    javac chap9/*.java
    java chap9.Main
fi

if [ $1 == 'chap10' ]; then
    cd chap10/src/main/java
    javac chap10/*.java
    java chap10.Main `echo $2`
fi

if [ $1 == 'exe1' ]; then
    cd exe1/src/main/java
    javac exe1/*.java
    java exe1.Main `echo $2`
fi

if [ $1 == 'exe2' ]; then
    cd exe2/src/main/java
    javac exe2/*.java
    java exe2.Main `echo $2`
fi
