#!/usr/bin/env groovy

def call(String buildResult) {
  if ( buildResult == "SUCCESS" ) {
    discordSend description: "From Jenkins Pipeline Build - ${env.JOB_NAME}", link: env.BUILD_URL, result: currentBuild.currentResult, unstable: false, title: JOB_NAME, webhookURL: env.discordWebHook, successful: true
  }
  else if( buildResult == "FAILURE" ) { 
     discordSend description: "From Jenkins Pipeline Build - ${env.JOB_NAME}", link: env.BUILD_URL, result: currentBuild.currentResult, unstable: false, title: JOB_NAME, webhookURL: env.discordWebHook, successful: false
  }
  else if( buildResult == "UNSTABLE" ) { 
     discordSend description: "From Jenkins Pipeline Build - ${env.JOB_NAME}", link: env.BUILD_URL, result: currentBuild.currentResult, unstable: false, title: JOB_NAME, webhookURL: env.discordWebHook, successful: false
  }
  else {
     discordSend description: "From Jenkins Pipeline Build - ${env.JOB_NAME}", link: env.BUILD_URL, result: currentBuild.currentResult, unstable: false, title: JOB_NAME, webhookURL: env.discordWebHook, successful: false
  }
}
