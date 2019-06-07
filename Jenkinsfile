#!/usr/bin/env groovy

pipeline {
  agent any
  options {
    timestamps()
  }
  triggers {
    bitbucketPush()
  }
  stages {

    stage('Checkout') {
      checkout scm
    }

    stage('Build hello-ui') {
      when {
        changeset "hello-ui/**"
      }
      steps {
        build 'hello-ui'
      }
    }

    stage('Build hello-service') {
      when {
        changeset "hello-service/**"
      }
      steps {
        build 'hello-service'
      }
    }

  }
}
