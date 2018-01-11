package grp.anon.anfx;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;


public class JFXPushyButton extends Button {

    private Integer radius = 10;
    private String btn_color;
    private String shadow_color;
    private final String PUSHYBTNSTYLE;
    private final String PUSHYEFFECT;

    public JFXPushyButton(String text,String btn_color,Integer radius ){
        super(text);
        super.setTextFill(Paint.valueOf(String.valueOf(Color.WHITE)));
        this.radius = radius;
        this.btn_color = btn_color;

        shadow_color = "#"+(String.valueOf(Color.valueOf(btn_color).darker()).substring(2,8));
        PUSHYBTNSTYLE = "-fx-background-color: "+btn_color+"; -fx-effect: dropshadow(gaussian, "+shadow_color+",0,10,0,6);-fx-background-radius: "+radius+";";
        PUSHYEFFECT = "-fx-background-color: "+btn_color+"; -fx-translate-y: 6px;-fx-background-radius: "+radius+"; -fx-effect: dropshadow(gaussian,"+shadow_color+",0,0,0,0);";

        super.setOnMousePressed(e->{
            super.setStyle(PUSHYEFFECT);
        });
        super.setOnMouseReleased(e->{
            super.setStyle(PUSHYBTNSTYLE);
        });
        super.setStyle(PUSHYBTNSTYLE);
    }

    public static class PushyBtnStyle{
        public final static class PUSHYCOLORS{
            public final static String RED = "#E65D4F";
            public final static String BLUE = "#3498DB";
            public final static String GREEN = "#1ABC9C";
            public final static String ORANGE = "#FF9800";
            public final static String GRAY = "#9E9E9E";
            public final static String DEEP_ORANGE = "#FF5722";
            public final static String DEEP_PURPLE = "#673AB7";
            public final static String PURPLE = "#9C27B0";
            public final static String PINK = "#E91E63";
        }
    }
}
