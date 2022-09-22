pipeline {
   agent any
   stages {
      stage('sanity checks') {
      steps {
        cleanWs() // clean jenkins so it re-clones
        checkout scm // re-clone/re-download
        sh 'git branch'
        sh "git checkout ${ghprbSourceBranch}"
        sh 'git branch'
        sh 'git status'
      } // end steps
  } // end stage
    stage('use dcover in Jenkins') {
      steps {
        withMaven(maven: 'maven3') 
            {
               sh ''' echo "Build project, you may need to update this to reflect your project"
                      mvn clean install -DskipTests
                  '''
            } // end withMaven step
      } // end steps
    } // end stage
  } // end stages
} // end pipeline
