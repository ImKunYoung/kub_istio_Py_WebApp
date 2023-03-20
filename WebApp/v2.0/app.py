from flask import Flask
import datetime

app = Flask(__name__)


@app.route("/")
def main():
    return "Welcome! The current date and time is: " + str(datetime.datetime.now())


if __name__ == "__main__":
    app.run(host='0.0.0.0')
