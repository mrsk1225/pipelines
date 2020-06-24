pipeline {
    agent any
    
    parameters {
        choice(choices: ['Choice-1', 'Choice-2'], description: 'What\'s your choice?', name: 'Select')
    }
    
    stages {
        
        stage ('Checkout') {
            steps {
                echo 'Checkout stage'
            }
        }
        
        stage ('Build') {
            steps {
                echo 'Build stage'
            }
        }
        
        stage ('Deploy to DEV') {
            when {
                expression {
                        Select == 'Choice-1'
                }
            }
            steps {
                echo 'Deploy to DEV stage'
            }
        }
        
        stage ('Deploy to TEST') {
            steps {
                echo 'Deploy to TEST stage'
            }
        }
        
        stage ('Run Test Cases') {
            steps {
                echo 'Testing stage'
            }
        }
        
        stage ('Deploy to PROD') {
            steps {
                echo 'Deploy to PROD stage'
            }
        }
    }
}
