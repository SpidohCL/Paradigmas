package cl.juego;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class VentanaExtraRegistro extends JFrame {

	private final JLabel bienvenidos = new JLabel ("Bienvenidos ");
	private final JLabel nombre = new JLabel ("Nombre       *");
	private final JLabel fecha = new JLabel ("Fecha          *");
	private final JLabel apellidos = new JLabel ("Apellidos     *");
	private final JLabel edad = new JLabel ("Edad           *");
	private final JLabel usuario = new JLabel ("Usuario       *");
	private final JLabel vista_previa = new JLabel ("Vista previa");

	private final JTextField campo_nombre = new JTextField( 20 );
	private final JTextField campo_apellidos = new JTextField( 20 );
	private final JTextField campo_usuario = new JTextField( 20 );
	
	ImageIcon miImagen = new ImageIcon("elefante.jpg"); 
	
	private final JButton Registrarse = new JButton ("Registrarse");
	private final JButton cancelar = new JButton ("Cancelar");
	private final JButton Imagen = new JButton (miImagen);
	
	
	public VentanaExtraRegistro() {
		setTitle("Registro");
		setSize(900,600);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contenedor = getContentPane();
		SpringLayout layout = new SpringLayout();
		contenedor.setLayout(layout);
		
		
		Registrarse.setBackground( new Color (0,255,0));
		cancelar.setBackground(Color.RED);
		Imagen.setBackground(Color.DARK_GRAY);
		
		Registrarse.setPreferredSize(new Dimension (150,40));
		cancelar.setPreferredSize(new Dimension (150,40));
		Imagen.setPreferredSize(new Dimension (250,250));
		
		bienvenidos.setFont(new Font( "Arial",Font.ITALIC, 35));
		nombre.setFont(new Font( "Arial",Font.ITALIC, 25));
		apellidos.setFont(new Font( "Arial",Font.ITALIC, 25)); 
		fecha.setFont(new Font( "Arial",Font.ITALIC, 25)); 
		edad.setFont(new Font( "Arial",Font.ITALIC, 25)); 
		usuario.setFont(new Font( "Arial",Font.ITALIC, 25)); 
		vista_previa.setFont(new Font( "Arial",Font.ITALIC, 25)); 
		
		bienvenidos.setForeground( new Color(105,80,255));
		nombre.setForeground( new Color(105,80,255));
		apellidos.setForeground( Color.BLUE);
		fecha.setForeground( Color.BLUE);
		edad.setForeground( Color.BLUE);
		usuario.setForeground( Color.BLUE);
		vista_previa.setForeground( Color.BLUE);
		
		campo_nombre.setForeground( new Color(105,80,255));
		campo_apellidos.setForeground( Color.BLUE);
		campo_usuario.setForeground( new Color(105,80,255));
		
		campo_nombre.setPreferredSize(new Dimension(50,30));
		campo_apellidos.setPreferredSize(new Dimension(50,30));
		campo_usuario.setPreferredSize(new Dimension(50,30));
		
		
		
		campo_nombre.setFont( new Font( "Arial",Font.BOLD, 15));
		campo_apellidos.setFont( new Font( "Arial",Font.BOLD, 15));
		campo_usuario.setFont( new Font( "Arial",Font.BOLD, 15));
		
		
		Registrarse.addActionListener ( new  ActionListener(){
			
			public void actionPerformed (ActionEvent evento)
			{
				
				if(campo_nombre.getText().isEmpty() || campo_apellidos.getText().isEmpty())
				{
				JOptionPane.showMessageDialog( getContentPane(),"Debe ingresar los 2  campos",
											   "Error" , JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog( getContentPane(),"tu nombre es : " + campo_nombre.getText() + 
					" " + campo_apellidos.getText(), "Bienvenido" , JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		
		cancelar.addActionListener ( new  ActionListener(){
					
					public void actionPerformed (ActionEvent evento)
					{
						
						if( ! campo_nombre.getText().isEmpty() ||  ! campo_apellidos.getText().isEmpty())
						{
						JOptionPane.showMessageDialog( getContentPane(),"Campos reiniciados",
													   "Exito" , JOptionPane.PLAIN_MESSAGE);
						
						campo_apellidos.setText("");
						campo_nombre.setText("");
						campo_usuario.setText("");
						}
						else
						{
							JOptionPane.showMessageDialog( getContentPane()," los campos ya estan limpios ",
														  "Error" , JOptionPane.ERROR_MESSAGE);
						}
					}
				});
		
		
		layout.putConstraint(SpringLayout.WEST,bienvenidos,150,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,bienvenidos,20,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,nombre,50,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,nombre,100,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,campo_nombre,220,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,campo_nombre,100,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,apellidos,50,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,apellidos,150,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,campo_apellidos,220,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,campo_apellidos,150,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,Registrarse,50,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,Registrarse,500,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,cancelar,300,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,cancelar,500,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,fecha,50,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,fecha,200,SpringLayout.NORTH,contenedor);
		
	
		layout.putConstraint(SpringLayout.WEST,usuario,50,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,usuario,300,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,campo_usuario,220,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,campo_usuario,300,SpringLayout.NORTH,contenedor);
		
		
		layout.putConstraint(SpringLayout.WEST,vista_previa,550,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,vista_previa,50,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,Imagen,550,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,Imagen,100,SpringLayout.NORTH,contenedor);
		
		
		contenedor.add(bienvenidos);
		contenedor.add(nombre);
		contenedor.add(fecha);
		contenedor.add(edad);
		contenedor.add(apellidos);
		contenedor.add(usuario);
		contenedor.add(campo_nombre);
		contenedor.add(campo_apellidos);
		contenedor.add(campo_usuario);
		contenedor.add(cancelar);
		contenedor.add(Registrarse);
		contenedor.add(Imagen);
		contenedor.add(vista_previa);
	
		this.setVisible(true);
	}
}