pipeline {
    agent any

    environment {
        MAVEN_OPTS = '-Dmaven.test.failure.ignore=false'
    }

    tools {
        maven 'Maven 3.8.1'   // Use the Maven version configured in Jenkins Global Tools
        jdk 'JDK 11'          // Use the JDK version configured in Jenkins Global Tools
    }

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
