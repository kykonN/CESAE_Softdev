
@extends('layouts.femaster')
@section('content')
    <h2>Aqui podes adicionar utilizadores</h2>
    <div class="container">
        <form method="POST" action="{{ route('users.create') }}">
            @csrf
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label">Nome</label>
                <input type="name" value="{{old ('name')}}" name="name" class="form-control" id="exampleFormControlInput1"
                    placeholder="name" required>
                @error('name')
                    <div class="alert alert-danger">
                        O nome que colocou é inválido.
                    </div>
                @enderror
            </div>
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label">Email</label>
                <input type="email" value="{{old ('email')}}" name="email" class="form-control" id="exampleFormControlInput1"
                    placeholder="email@exemplo.com" required>
                @error('email')
                    <div class="alert alert-danger">
                        O mail que colocou já está registado
                    </div>
                @enderror
            </div>
            <div class="mb-3">
              <label for="exampleFormControlInput1" class="form-label">Email</label>
              <input type="password" value="{{old ('password')}}" name="password" class="form-control" id="exampleFormControlInput1"
                  placeholder="password" required>
              @error('password')
                  <div class="alert alert-danger">
                      Erro Password
                  </div>
              @enderror
          </div>
          <button type="submit" class="btn btn-primary">Enviar</button>
        </form>
        <br>
        <br>
        <a class="btn btn-success" href="{{ route('home.index') }}">Voltar</a>
        <br>

    </div>
@endsection