package pl.emdzej.lottery;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/lottery")
public class LotteryController extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
      List<Integer> myNumbers = getNumbers(req);
      List<Integer> randomNumbers = Lottery.getRandomList();
      List<Integer> matchNumbers = Lottery.getCommonElement(myNumbers,randomNumbers);

      LotteryResults lotteryResults = new LotteryResults(myNumbers,randomNumbers,matchNumbers);
      req.setAttribute("lotteryResult", lotteryResults);
      req.getRequestDispatcher("result.jsp").forward(req,resp);
    }

    private List<Integer> getNumbers (HttpServletRequest request)
    {
        String[] numbersFromPage = request.getParameterValues("numbers");
        ArrayList<Integer> formatNumbers = new ArrayList<>();

        for (String nr: numbersFromPage)
        {
         formatNumbers.add(Integer.parseInt(nr));
        }
    return formatNumbers;
    }
}
