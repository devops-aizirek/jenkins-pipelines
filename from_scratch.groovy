node {
    // Bellow line sets "Discard Builds more than 5"
    properties([buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '', numToKeepStr: '5')), pipelineTriggers([cron('* * * * *')])])
    // Bellow line  trigger this job every minute   
    pipelineTriggers([cron('* * * * *')])
])



     stage("Stage1"){
       echo "hello" 
} 
   stage("Stage2"){ 
       echo "hello" 
} 
   stage("Stage3"){ 
       echo "hello" 
} 
   stage("Stage4"){ 
       echo "hello" 
} 
   stage("Stage5"){ 
       echo "hello" 
   } 
} 
