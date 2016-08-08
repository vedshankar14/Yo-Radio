package controllers;

import play.mvc.*;

import views.html.*;

import java.util.*;

public class ListController extends Controller {

    public Result list() {
        List<String> l = new ArrayList<String>();
        l.add("A");l.add("B");l.add("C");
        return ok(list.render(l));
    }

}