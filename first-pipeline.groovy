pipeline {
    agent any
    
    stages {
        stage ('Checkout') {
            echo 'Checkout stage'
        }
    }
}
