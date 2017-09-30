import scala.util.control.Breaks._
object BreakImplement
{
    def main(args:Array[String])
    {
        println("Break for loop :")
        breakForLoop
        println("Break Inner for Loop :")
        breakInnerLoop
    }

    def breakForLoop
    {
        breakable
        {
            for(i<-1 to 10 by 2)
            {
                if(i==7)
                    break;
                else
                    println(i)
            }
        }
    }

    def breakInnerLoop
    {
        for(i<-1 to 3)
        {
            breakable
            {
                for(j<-1 to 3)
                {
                    if(i==2 && j==2)
                        break
                    println(i+" "+j)
                }
            }
        }
    }
}