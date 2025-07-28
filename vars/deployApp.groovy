def call(Map config = [:]) {
    echo "Deploying ${config.appName} to ${config.env} and the cluster name is ${config.cluster}"
}
