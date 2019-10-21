pipeline {
    agent {
        label 'android'
    }
    stages {
        stage('clean') {
            steps { 
                echo 'Cleaning..'
                sh './gradlew clean'
                sh './gradlew lintFix'
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
                sh './gradlew build'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                archiveArtifacts '**/*.apk'
            }
        }
    }
}