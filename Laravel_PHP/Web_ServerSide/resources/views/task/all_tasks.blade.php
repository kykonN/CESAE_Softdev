@extends ('layouts.femaster')
@section('content')
<h1>Aqui vão mostrar as tarefas </h1>

<table class="table">
 
    <thead>
        <tr>
          <th scope="col">ID</th>
          <th scope="col">NOME TASK</th>
          <th scope="col">User_ID</th>
         
        </tr>
      </thead>
    <tbody>
        @foreach ($tasks as $item)

         <tr>
             <th scope="row">{{$item->id}}</th>
             <td>{{$item->name}}</td>
             <td>{{$item->usname}}</td>
             <td><a class = "btn btn-info" href="{{route('tasks.view', $item->id)}}">Ver</a></td>
             <td><a class = "btn btn-danger" href={{route ("tasks.delete", $item->id ) }} >apagar</a></td>
         </tr>

        @endforeach
     </tbody>
</table>

@endsection



