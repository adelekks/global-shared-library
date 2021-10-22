def build(String maven) {
    sh """
        echo "This's Maven build.."
    """
}

def build(String nodejs) {
    sh """
        echo "This's NodeJS build.."
    """
}
