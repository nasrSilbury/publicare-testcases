pipeline {
    agent {
        docker {
            image 'katalonstudio/katalon'
            args "-u root"
        }
    }
    stages {
		
		stage('TEST-LANG-DE') {
            steps {
                sh 'katalon-execute.sh -browserType="Chrome (headless)" -retry=0 -statusDelay=15 -executionProfile="dev-lang-de"  -testSuitePath="Test Suites/TESTCASES_DE"';
            }
        }
		stage('TEST-LANG-FR') {
            steps {
                sh 'katalon-execute.sh -browserType="Chrome (headless)" -retry=0 -statusDelay=15 -executionProfile="dev-lang-fr"  -testSuitePath="Test Suites/TESTCASES_FR"';
            }
        }
		stage('Deploy') {
            steps {
                echo 'Pass !';
            }
        }
        
    }
    post {
        always {
            echo 'This will always run'
        }
		success{
			echo 'This will run only if succesfull'
		}
		failure{
			echo 'This will run only if failed'
		}
		unstable{
			echo 'This will run only if the run was marked as unstable'
		}
		changed{
			echo 'THis will run only if the run was marked as unnstable'
			echo 'For example, if the Pipleline was previously failinlg but is now succesful'
		}
    }
}