pipeline {
    agent any
    
    stages {
        stage ('Checkout') {
            steps {
                step ('Step 1') {
                    echo 'Checkout stage - Step 1'
                }
            }
        }
    }
}
