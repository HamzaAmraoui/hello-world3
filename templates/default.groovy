@Library('my-shared-library') _
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                script {
                    // Importar el stage adecuado según el tipo de aplicación
                    if (application_type == 'java') {
                        checkout()
                    } else if (application_type == 'nodejs') {
                        checkout()
                    }
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    // Implementa la lógica de build para Java o Node.js
                    if (application_type == 'java') {
                        echo 'Building Java application'
                    } else if (application_type == 'nodejs') {
                        echo 'Building Node.js application'
                    }
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    // Implementa la lógica de deploy para Java o Node.js
                    if (application_type == 'java') {
                        echo 'Deploying Java application'
                    } else if (application_type == 'nodejs') {
                        echo 'Deploying Node.js application'
                    }
                }
            }
        }
    }
}
