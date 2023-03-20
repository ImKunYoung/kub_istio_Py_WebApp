from flask import Flask
import datetime
import time

time.sleep(60)
app = Flask(__name__)


@app.route('/')
def main():
    return 'Welcome user! current time is: ' + str(datetime.datetime.now())


@app.route('/health')
def health():
    return 'OK'


if __name__ == '__main__':
    app.run(host='0.0.0.0')
