import com.sun.net.httpserver.Request
import java.nio.channels.Channel

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /*CoroutineScope(IO).launch{
        delay(1000)
        println("Page 6- Coroutine created")
    }
    val deferred=GlobalScope.async{
        "Page7"
    }
    runBlocking{
        val çıktı=deferred.await()
        println(çıktı)
    }
    runBlocking{
        delay(5000)
        println("Page 8")
    }
    CoroutineScope(Dispatchers.Main).launch{
        val text="Page 9"
        textView.text=text
    }
    CoroutineScope(IO).launch{
        val url="https://example.com/api/data"
        val response=URL(url).readText()
        println(response)
        //Page-10
    }
    CoroutineScope(Dispatchers.Default).launch{
        var sum=0
        for(i in 0..100000){
            sum += i
        }
        println("Page 11 Toplam= $sum")
    }
    val url2="https://api.example.com/data"
    CoroutineScope(IO).launch{
        withContext(Dispatchers.IO){
            val response=URL(url2).readText()
            println("Page 12 Veri= $response")
        }
    }
    val scope=CoroutineScope(IO)
    fun myCaroutine(name:Name){
        scope.launch{
            withContext(name){

            }
        }
    }
    //Page 13
    val scope=CoroutineScope(IO)
    val name=Name()
    scope.launch(name){

    }
    name.cancel()

    fun getNumbers(delay:Long):List<Int>{
        val numbers = mutableListOf<Int>()
        for(i in 1..10){
            Thread.sleep(delay)
            numbers.add(i)
        }
        return numbers
    }

    fun main(){
        val numbers=getNumbers(100)
        for(number in numbers){
            println("Page 15: $number")
        }
    }

    fun getNumbersFlow(delay:Long):Flow<Int>{
        return flow{
            for(i in 1..10){
                emit(i)
                delay(delay)
            }
        }
    }
    fun main(){
        val flow =getNumbersFlow(100)
        launch{
            for(number in flow){
                println("Page 16 $number")
            }
        }
    }

    val scope=CoroutineScope(IO)
    scope.launch{
        //Page 17
    }

    val supervisorJob=SupervisorJob()
    val scope = CoroutineScope(supervisorJob)
    scope.launch{
        //Page 18
    }
    scope.launch{
        //diğer coroutine için, birinci hata alırsa diye
    }

    val unsupervisedJob=SupervisorJob()
    val scope = CoroutineScope(unsupervisedJob)
    scope.launch{
        //Page 19
    }
    scope.launch{
        //diğer coroutine için, birinci hata alırsa ikincisi de iptal olur
    }

    val uiScope=MainCoroutineScope()
    uiScope.launch{
        //Page 20
    }

    val supervisorScope=SupervisorScope()
    supervisorScope.launch{
        //Page 21
    }

    val flow = flow{
        emit(1)
        emit(2)
        emit(3)
    }
    flow.collect{value->println("Page 23 $value")}

    val numbers= listOf(5,7,9)
    val flow = numbers.asFlow()
    flow.collect{value->println("Page 24 $value")}

    val numberFlow = flow{
        emit(1)
        emit(2)
        emit(3)
    }
    val sayiKüpü=numberFlow.map{sayi->sayi*sayi*sayi}
    sayiKüpü.collect{küp-> println("Page 25 $küp") }

    val numberFlow = flow{
        emit(1)
        emit(2)
        emit(3)
        emit(4)
        emit(5)
    }
    val çiftlerFlow=numberFlow.filter{sayi->sayi%2==0}
    çiftlerFlow.collect{çift-> println("Page 26 $çift") }

    suspend fun performRequest(request: Int):String{
        delay(1000)
        return "Page 27 $request"
    }
    fun main()=runBlocking<Unit>{
        (1..3).asFlow()
            .transform{request->
                emit("Page 27 $request")
                emit(performRequest(request))
            }
            .collect{response->println(response)}
    }

    val numberFlow = flow{
        emit(1)
        emit(2)
        emit(3)
        emit(4)
        emit(5)
    }
    numberFlow
        .flowOn(Dispatchers.IO)
        .collect{sayi->println("Page 28 $sayi")}


    import kotlinx.coroutines.*
            fun main()=runBlocking{
                val kanal=Channel<Int>()
                launch{
                    println("Page 31")
                    kanal.send(10){
                        println("10 gönderildi")
                    }
                    launch{
                        println("Page 31")
                        kanal.send(10){
                            println("10 alındı")
                        }
                        launch {
                            println("Page 32")
                            for (i in 1..5) {
                                kanal.send("$i") {
                                    println("$i gönderildi")
                                }
                            }
                        }
                        launch{
                            println("Page 32")
                            while(true){
                                val mesaj=kanal.receive()
                                println("$mesaj alındı")
                            }
                        }
                }
            }
    import kotlinx.coroutines.*
            fun main()=runBlocking{
                val kanal=ticker(1000,0)
                launch{
                    println("Page 33")
                    while(true){
                        kanal.receive()
                        println("Page 33")
                    }
                }
                delay(5000)
            }
*/
}