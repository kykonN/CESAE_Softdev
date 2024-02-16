@extends('layouts.femaster')


@section ('content')

<h2> Hello World, estamos nas Views </h2>
@auth
    Olá, {{Auth::user()->name}}
@endauth Estas no Back Office.
@auth
@if ($message)
<div class = 'allert-success'>
    <h5>Boa, és admin desta app </h5>
<h5> Tens disponiveis estes links : </h5>

{{--Para Criar link na Pagina home e chamar a blade que queremos !!! --}}
<ul>

    <li><a href="{{route ('bemvindos')}}">vai para casa!</a></li>
    <li><a href="{{route ('users.add')}}">Aqui podes adicionar</a></li>
    <li><a href="{{route('users.all')}}"> todos os utilizadores </a></li>
    <li><a href="{{route('tasks.all')}}">todas as tarefas aqui </a></li>
    <li><a href="{{route('tasks.add')}}">adicionar tarefa </a></li>
    
@endsection
    

