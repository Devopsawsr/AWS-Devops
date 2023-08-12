pipeline {
    agent any
    stages {
        stage ("GIT Clone") {
            steps {
                checkout  scm
                echo "The code has been cloned"
            }
        }
        stage ("Deployment") {
            steps {
                sh "sudo cp /var/lib/jenkins/workspace/${JOB_NAME}/index.html /var/www/html/"
            }
        }
    }
}
