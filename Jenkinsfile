pipeline {
    agent any
    tools {
        maven 'Maven3'
        jdk 'jdk1.8.0_171'
    }
    stages {
        
        stage ('Build') {
            steps {
                 bat 'mvn compiler:compile'
            bat 'mvn install'
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }
        }     
}
    }
