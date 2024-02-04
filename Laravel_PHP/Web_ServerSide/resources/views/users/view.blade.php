@extends ('layouts.femaster')
@section('content')
<h1>Ver Atualizar user {{$myUser->name}} </h1>

<div class="container">
    <form method="POST" action="{{ route('users.update') }}">
        @csrf
        <input type="hidden" name='id' value={{$myUser->id}}>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Nome</label>
            <input type="texto" value="{{$myUser->name}}" name="name" class="form-control" id="exampleFormControlInput1" placeholder="Nome"
                required>
            @error('name')
                <div class="alert alert-danger">
                    O nome que colocou é inválido.
                </div>
            @enderror
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Email</label>
            <input disabled type="email" value="{{$myUser->email}}" name="email" class="form-control" id="exampleFormControlInput1"
                placeholder="email@exemplo.com" required>
            @error('email')
                <div class="alert alert-danger">
                    O mail que colocou já está registado
                </div>
            @enderror>
        <button type="submit" class="btn btn-primary">Enviar</button>
    </form>
    <br>
    <a class="btn btn-success" href="{{ route('home.index') }}">Voltar</a>
    <br>

</div>



@endsection