<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use App\Models\Task;


class TaskController extends Controller
{

    public function createTask (Request $request) {

        //dd($request->all());

        $request->validate([
            'user_id'=>'required',
            'name'=>'required | string|max:50',
            

        ]);

       Task::insert([
            'name' =>$request -> name,
            'user_id' =>$request->user_id,
            
        ]);

        return redirect () -> route ('tasks.all')->with('message', 'Bem-vindo ao mercado NEGRO ! ');
    


    }
    public function viewTask ($id){

        $myTask = Db :: table('tasks')
        ->where('tasks.id', $id)
                ->join('users', 'user_id','=','users.id')
                ->select('tasks.*', 'users.name as usname')
                ->first();


                $users=DB::table('users')
                ->get();

                return view ('task.view_tasks',compact('myTask', 'users'));
    }

  

public function deleteTask ($id){
    Db::table('tasks')
    ->where('id', ($id))
    ->delete();

    return back();
}

    public function allTasks () {

        $tasks = $this->getAllTasks();

       // dd($tasks);


        return view('task.all_tasks',compact('tasks'));
}

private function getAllTasks () {
 // Fazer o get da base de dados 
    $tasks = DB:: table ('tasks') 
    
    ->join('users', 'user_id','=','users.id')
    ->select('tasks.*', 'users.name as usname')
    ->get ();
// fazer return doque queremos da BD 
    return $tasks;


}

public function updateTask(Request $request){

    //dd($request->all);

  Task::where('id', $request->id)
   ->update([
        'name'=>$request->name,
        'description'=>$request->description,
        
    ]);

    return redirect ()->route('tasks.all')->with('message', 'Atualização concluida');




}
}
