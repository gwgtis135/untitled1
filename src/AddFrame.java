import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class   Listenerbtn implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        JButton button = (JButton)e.getSource();
        button.setText("클릭됨");
    }
}

public class AddFrame  extends JFrame {
    public AddFrame(){

        //프로그램 이름
        setTitle("JAVA  프로그램");

        //프로그램 GUI의 사이즈 설정
        setSize(500,500);



        //레이아웃 설정
        this.setLayout(new FlowLayout());

        //요소의 객체 생성
        JButton button = new JButton("버튼");
        button.addActionListener(new Listenerbtn());
        JCheckBox ckbox = new JCheckBox("체크박스");
        JSlider slider = new JSlider();
        JTextField tf = new JTextField("텍스트 입력",20);
        //레이아웃 설정
        this.setLayout(new FlowLayout());

        //컴포넌트 객체 추가
        this.add(button);
        this.add(ckbox);
        this.add(slider);
        this.add(tf);

// GUI보이게 할지 여부
        setVisible(true);


        //오른쪽 상단에 X버튼을 누르면 꺼지도록 설정
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

