su -

cd /opt/bitnami/apps/jenkins/jenkins_home/workspace/spring-rest-application/

docker build -t tcs-icpdemo.icp:8500/default/springboot:rest .

docker push tcs-icpdemo.icp:8500/default/springboot:rest