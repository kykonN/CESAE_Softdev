@extends ('layouts.femaster')
@section ('content')
<h3> Olá  , sou um user </h3>


<p> {{$hello}}</p>
<p> {{$helloAgain}}</p>
<p> {{$daysOfweek[1]}}</p>
{{-- <p> {{$info ['name'] }}</p>
<p> {{$info ['modules'] [0] }}</p> --}}
{{-- <p>{{$cesaeinfo['name']}}</p>
<p>{{$cesaeinfo['address']}}</p>
<p>{{$cesaeinfo['email']}}</p> --}}

@if(session('message'))
  <div class="alert alert-success">
    {{session('message')}}
  </div>
 @endif


<ul>
    @foreach ($users as $user)
        <li> {{$user ->name}} e o email é {{$user->email}}
        </li>
    @endforeach
</ul>

<h3>Aqui podes ver todos os Utilizadores</h3>
 <br><br>
 
 <table class="table">
 
    <thead>
        <tr>
          <th scope="col">ID</th>
          <th scope="col">NOME</th>
          <th scope="col">TELEMÓVEL</th>
          <th scope="col">E-MAIL</th>
          <th></th>
        </tr>
      </thead>
    <tbody>
        @foreach ($users as $item)
<tr>
             <th scope="row">{{$item->id}}</th>
             <td>{{$item->name}}</td>
             <td>{{$item->phone}}</td>
             <td>{{$item->email}}</td>
             <td><a href="{{route('users.view',$item->id)}}"class="btn btn-info">Ver</a></td>
             <td><a href="{{route('users.delete',$item->id)}}"class="btn btn-danger">Apagar</a></td>
         </tr>

        @endforeach
     </tbody>
</table>
@endsection