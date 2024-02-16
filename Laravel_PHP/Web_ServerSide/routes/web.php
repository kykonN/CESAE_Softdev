<?php

use App\Http\Controllers\DasboardController;
use App\Http\Controllers\IndexController;
use App\Http\Controllers\TaskController;
use App\Http\Controllers\UserController;
use Illuminate\Support\Facades\Route;
use SebastianBergmann\CodeCoverage\Report\Html\Dashboard;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "web" middleware group. Make something great!
|
*/

Route::get('/', function () {
    return view('welcome');
})->name('bemvindos');

Route::get('/home', [IndexController::class,'index'])->name('home.index');


Route::get('/ola', function () {
    return '<h1> Hello Turma de Software</h1>';
})->name('home.hello');


Route::get('/hello/{nome}', function ($nome) {
    return '<h1> Hello Turma de Software </h1>'.$nome;
});
//Backoffice ROTAS 


Route::get('/backoffice',[DasboardController::class,'viewBackoffice'])->name('backoffice.backoffice')->middleware('auth');
// Rotas de Users 


Route::get('/users/add',[UserController::class, 'addUser'] )->name('users.add');

Route::get('/users/all',[UserController::class, 'allUser'] )->name('users.all');

Route::get('/users/delete/{id}', [UserController::class, 'deleteUser'])->name('users.delete');

Route::post('/users/update', [UserController::class, 'updateUser'])->name('users.update');

Route::post('/users/create',[UserController::class, 'createUser']) ->name ('users.create');
// Primeiro Criar a ROTA 
Route::get('/users/view/{id}', [UserController::class, 'viewUser'])->name('users.view');



Route::fallback(function(){  return view ('main.fallback'); });

Route::post('/tasks/add', [TaskController::class, 'updatetasks'])->name('tasks.add');




//rotas de task


Route::get('/tasks/add',[TaskController::class, 'addTask'] )->name('tasks.add');


Route::get('/tasks',[TaskController::class, 'allTasks']) ->name('tasks.all');


Route::post('/tasks/update', [TaskController::class, 'updateTask'])->name('tasks.update');


Route::get('/tasks/create',[TaskController::class, 'createTask']) ->name('tasks.create');


Route::get('/tasks/delete/{id}',[TaskController::class, 'deleteTask']) ->name('tasks.delete');


// --------------

Route::get('/tasks/view/{id}', [TaskController::class, 'viewTask'])->name('tasks.view');
Route::get('/tasks/delete/{id}', [TaskController::class, 'deleteTask'])->name('tasks.delete');

