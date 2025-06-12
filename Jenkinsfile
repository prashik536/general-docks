pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                echo '📥 Cloning repository...'
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                echo '🔧 Running mvn clean test...'
                sh 'mvn clean test'
            }
        }

        stage('Package') {
            steps {
                echo '📦 Packaging application...'
                sh 'mvn package'
            }
        }

        stage('Archive Artifacts') {
            steps {
                echo '📁 Archiving built jar...'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }

    post {
        success {
            echo '✅ Build and tests succeeded!'
        }
        failure {
            echo '❌ Build or tests failed.'
        }
    }
}
