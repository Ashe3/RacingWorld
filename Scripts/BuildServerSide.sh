#!/bin/bash

readonly CURRENT_PATH=$(pwd)
readonly SERVER_SIDE_PATH=$CURRENT_PATH/../ServerSide
readonly GAME_SERVER_PATH=$SERVER_SIDE_PATH/gameserver
readonly DATABASE_SERVER_PATH=$SERVER_SIDE_PATH/databaseserver
readonly RESOURCE_SERVER_PATH=$SERVER_SIDE_PATH/resourceserver
readonly PROTOCOL_PATH=$SERVER_SIDE_PATH/protocol

echo "Copyright 2018 Vladimir Balun - Script to build all the servers on Linux."

if ! [ -x "$(command -v mvn)" ]; then
  echo "Error: Maven is not installed." >&2
  exit 1
fi	

echo "Building of the protocol between servers..."
cd $PROTOCOL_PATH
mvn clean compile assembly:single

echo "Building of the game server..."
cd $GAME_SERVER_PATH
mvn clean compile assembly:single

echo "Building of the database server..."
cd $DATABASE_SERVER_PATH
mvn clean compile assembly:single

echo "Building of the resource server..."
cd $RESOURCE_SERVER_PATH
mvn clean compile assembly:single