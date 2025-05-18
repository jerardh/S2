
echo "Number of users"
who | wc -l

echo "List of files in home directory"
 ls -l / | cut -d " " -f 15 - > t1.txt
 cat t1.txt

echo "jobs with lower protority"
ps -a -l | cut -c 14-20,30-33 > filepty.txt
grep "-" filepty.txt

