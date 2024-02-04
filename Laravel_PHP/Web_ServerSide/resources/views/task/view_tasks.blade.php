
@extends ('layouts.femaster')

@section('content')

<h1>Ver as tasks</h1>

<form method="POST" action="{{route('tasks.update')}}">
    @csrf

    <input type="hidden" name="id" value={{ $myTask->id }} id="">

    <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Tarefa</label>
        <input type="texto" value="{{ $myTask->name }}" name='name' class="form-control" id="exampleFormControlInput1" placeholder="Tarefa" required>
        @error('name')
        <div class="alert alert-danger">A tarefa colocada e invalida</div>
        @enderror
    </div>
    <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Descricao</label>
        <input  type="texto"  value="{{ $myTask->description }}"  name='description' class="form-control" id="exampleFormControlInput1" placeholder="Descricao">
        @error('description')
        <div class="alert alert-danger">A descricao e invalida</div>
        @enderror
    </div>
      
    </select>



    <button type="submit" class="btn btn-info">Atualizar</button>
</form>
@endsection