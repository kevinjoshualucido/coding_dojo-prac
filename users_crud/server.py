from flask import Flask, render_template, request, redirect, session
from users import User
app = Flask(__name__)
app.secret_key = "This is a secret key."


@app.route('/')
def index():
    users = User.read_all()
    return render_template('show_all.html', users=users)


@app.route('/create', methods=['POST'])
def add_user():
    User.create(request.form)
    return redirect('/')


@app.route('/add_user')
def create_user():
    return render_template('create.html')


@app.route('/users/edit/<int:user_id>')
def edit_user(user_id):
    user = User.show_one(user_id)
    return render_template('edit.html', user=user)


@app.route('/users/<int:user_id>')
def show_one(user_id):
    one_user = User.show_one(user_id)
    return render_template('show_one.html', one_user=one_user)


@app.route('/users/update', methods=['POST'])
def update():
    User.update(request.form)
    return redirect('/')


@app.route('/users/delete/<int:user_id>')
def delete(user_id):
    User.delete(user_id)
    return redirect('/')


if __name__ == '__main__':
    app.run(debug=True, port=8000)
