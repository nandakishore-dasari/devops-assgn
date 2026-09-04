#!/bin/bash

echo "===== SYSTEM INFORMATION ====="

read -p "Enter your name: " student_name

mkdir -p system_data
touch system_data/processes.txt

current_date=$(date)
host_name=$(hostname)
user_name=$(whoami)
disk_usage=$(df -h)

ps > system_data/processes.txt

echo
echo "Hello, $student_name!"
echo
echo "Current Date: $current_date"
echo "Hostname: $host_name"
echo "Username: $user_name"
echo
echo "Disk Usage:"
echo "$disk_usage"
echo
echo "Running Processes:"
cat system_data/processes.txt
