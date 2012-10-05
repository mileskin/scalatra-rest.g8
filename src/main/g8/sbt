# For remote debug add:
# -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005

java -Xms512M -Xmx1536M -Xss1M -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=384M -jar $(dirname $0)/project/sbt-launch-0.12.0.jar "$@"

