<?php

namespace App\Http\Controllers;

use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Hash;


class UserController extends Controller
{



    public function viewUser ($id){

        $myUser = DB::table('users')
        ->where('id',$id)
        ->first();

        
        return view('users.view',compact('myUser'));
    }

public function deleteUser ($id){
    Db::table('tasks')
    ->where('user_id', ($id))
    ->delete();

    Db::table('users')
        ->where('id', ($id))
        ->delete();

    return back();
}

    public function addUser () {
       // DB::table('users')
       // ->updateOrInsert(
            
           // ['email'=>'lulu@gmail.com'

       // ],
          //  [ 
          //  'name'=>'lulu',
            

           // 'password'=> 'lul123',
          //  'updated_at'=> now (),
           // 'created_at'=> now ()
      //  ]);

        
         //$users= DB:: table('users') ->get();

         //$myUser = DB:: table('users') -> where('password', 'lulu123')->first();


        return view('users.add_user');
    }

    public function createUser (Request $request) {

        //dd($request->all());

        $request->validate([
            'email'=>'required | unique:users',
            'name'=>'required | string|max:5',

        ]);

        User::insert ([
            'name' =>$request -> name,
            'email' =>$request->email,
            'password'=>Hash::make($request->password),
        ]);

        return redirect () -> route ('users.all')->with('message', 'Bem-vindo ao mercado NEGRO ! ');
    }

    public function updateUser(Request $request){

        //dd($request->all);

        User::where('id', $request->id)
       ->update([
            'name'=>$request->name,
            'address'=>$request->address,
            'phone'=>$request->phone,
        ]);

        return redirect ()->route('users.all')->with('message', 'Atualização concluida');




    }

    public function allUser (){
        $hello = 'Finalmente vamos para codigo';
        $helloAgain = 'cucu';
        $daysOfweek = $this->getWeekDays();
       // $info = $this->info();
       // $users = $this->getContacts();

       // dd($users);

     

        $search = request()->query('search') ? request()->query('search') : null;
        //dd($search);
        $users = DB::table('users');

        if($search){
            $users=$users
            ->where ('name', 'like' , "%{$search}")
            ->orWhere('email','like',"%{$search}%");
        
        };

        $users=$users->get();   
        
        
return view('users.all_users', compact(
            'hello',
            'helloAgain',
            'daysOfweek',
           // 'info',
        'users'));
    }


    private function getWeekDays () {

        $daysOfweek = ['Segunda','Terça','Quarta','Quinta'];

        return $daysOfweek;
    }


    private function courseInfo () {

        //array associativo 
        //Não tem posições mas pode ter arrays dentro do mesmo array

        $courseInfo = [
            'name' =>'software Developer',
            'year' => 2024,
            'modules'=> ['PHP','WebServices','Java'],
            ['','4','Sofia','João']
        ];

        return $courseInfo;
    }


    private function getCesaeinfo () {

        $cesaeinfo = [
            'name'=> 'Cesae',
            'address'=>'Rua Ciriaco Cardoso 186, 4150-212 Porto',
            'email'=>'cesae@cesae.pt'
        ];
    }

    // Base dados

    private function getContacts () {

    //       $users = [
    //     ['id'=> 1, 'name'=>'Sara', 'phone'=>'91222222', 'email'=> 'sara@gmail.com'],
    //     ['id'=>'2', 'name'=>'Joaquim','phone'=> '91222222',  'email'=>'Joaquim@gmail.com'],
    //     ['id'=>'3', 'name'=>'Helder','phone'=> '91222222',  'email'=>'Helder@gmail.com'],
    //     ['id'=>'4', 'name'=>'Bruno', 'phone'=>'91222222',  'email'=>'Bruno@gmail.com'],


    // ];^

    $users = db::table('users') 

//-> WhereNotNull ('updated_at')

-> get();

//$users = User:: get();
    return $users;
    
}
}
