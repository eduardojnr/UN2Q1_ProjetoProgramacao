package prova2;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class telaMenu extends javax.swing.JFrame {
    
    ArrayList<Medicos> listaMedicos;
    ArrayList<Pacientes> listaPacientes;
    ArrayList<Consultas> listaConsultas;
    
    String modo_m;
    String modo_p;
    String modo_c;
    
    public void ManipulaInterface_m(){
        
        switch(modo_m){
            case "Navegar":
                btn_m_Novo.setEnabled(true);
                btn_m_Editar.setEnabled(false);
                btn_m_Excluir.setEnabled(false);
                
                btn_m_Salvar.setEnabled(false);
                btn_m_Cancelar.setEnabled(false);
                
                input_m_Cpf.setEnabled(false);
                input_m_Nome.setEnabled(false);
                input_m_Endereco.setEnabled(false);
                input_m_Crm.setEnabled(false);
                input_m_Status.setEnabled(false);
                break;
                
            case "Novo":
                btn_m_Novo.setEnabled(false);
                btn_m_Editar.setEnabled(false);
                btn_m_Excluir.setEnabled(false);
                
                btn_m_Salvar.setEnabled(true);
                btn_m_Cancelar.setEnabled(true);
                
                input_m_Cpf.setEnabled(true);
                input_m_Nome.setEnabled(true);
                input_m_Endereco.setEnabled(true);
                input_m_Crm.setEnabled(true);
                input_m_Status.setEnabled(true);
                break;
                
            case "Editar":
                btn_m_Novo.setEnabled(true);
                btn_m_Editar.setEnabled(false);
                btn_m_Excluir.setEnabled(false);
                
                btn_m_Salvar.setEnabled(true);
                btn_m_Cancelar.setEnabled(true);
                
                input_m_Cpf.setEnabled(true);
                input_m_Nome.setEnabled(true);
                input_m_Endereco.setEnabled(true);
                input_m_Crm.setEnabled(true);
                input_m_Status.setEnabled(true);
                break;
                
            case "Excluir":
                btn_m_Novo.setEnabled(true);
                btn_m_Editar.setEnabled(false);
                btn_m_Excluir.setEnabled(false);
                
                btn_m_Salvar.setEnabled(false);
                btn_m_Cancelar.setEnabled(false);
                
                input_m_Cpf.setEnabled(false);
                input_m_Nome.setEnabled(false);
                input_m_Endereco.setEnabled(false);
                input_m_Crm.setEnabled(false);
                input_m_Status.setEnabled(false);
                break;
                
            case "Selecao":
                btn_m_Novo.setEnabled(true);
                btn_m_Editar.setEnabled(true);
                btn_m_Excluir.setEnabled(true);
                
                btn_m_Salvar.setEnabled(false);
                btn_m_Cancelar.setEnabled(false);
                
                input_m_Cpf.setEnabled(false);
                input_m_Nome.setEnabled(false);
                input_m_Endereco.setEnabled(false);
                input_m_Crm.setEnabled(false);
                input_m_Status.setEnabled(false);
                break;    
                
            default: System.out.println("Modo inválido");
        }
    }
    
    public void tabelaMedicos(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"CRM", "CPF", "NOME", "ENDEREÇO", "STATUS"},0);
        
        for(int i=0;i<listaMedicos.size();i++){
            Object linha[] = new Object[]{listaMedicos.get(i).getCrm_m(),
                                          listaMedicos.get(i).getCpf_m(),
                                          listaMedicos.get(i).getNome_m(),
                                          listaMedicos.get(i).getEndereco_m(),
                                          listaMedicos.get(i).getStatus_m()};
            modelo.addRow(linha);
            }
        
        tableMedicos.setModel(modelo);
    }    
    
    public void ManipulaInterface_p(){
       switch(modo_p){
            case "Navegar":
                btn_p_Novo.setEnabled(true);
                btn_p_Editar.setEnabled(false);
                btn_p_Excluir.setEnabled(false);
                
                btn_p_Salvar.setEnabled(false);
                btn_p_Cancelar.setEnabled(false);
                
                input_p_Cpf.setEnabled(false);
                input_p_Nome.setEnabled(false);
                input_p_Endereco.setEnabled(false);
                break;
                
            case "Novo":
                btn_p_Novo.setEnabled(false);
                btn_p_Editar.setEnabled(false);
                btn_p_Excluir.setEnabled(false);
                
                btn_p_Salvar.setEnabled(true);
                btn_p_Cancelar.setEnabled(true);
                
                input_p_Cpf.setEnabled(true);
                input_p_Nome.setEnabled(true);
                input_p_Endereco.setEnabled(true);
                break;
                
            case "Editar":
                btn_p_Novo.setEnabled(true);
                btn_p_Editar.setEnabled(false);
                btn_p_Excluir.setEnabled(false);
                
                btn_p_Salvar.setEnabled(true);
                btn_p_Cancelar.setEnabled(true);
                
                input_p_Cpf.setEnabled(true);
                input_p_Nome.setEnabled(true);
                input_p_Endereco.setEnabled(true);
                break;
                
            case "Excluir":
                btn_p_Novo.setEnabled(true);
                btn_p_Editar.setEnabled(false);
                btn_p_Excluir.setEnabled(false);
                
                btn_p_Salvar.setEnabled(false);
                btn_p_Cancelar.setEnabled(false);
                
                input_p_Cpf.setEnabled(false);
                input_p_Nome.setEnabled(false);
                input_p_Endereco.setEnabled(false);
                break;
                
            case "Selecao":
                btn_p_Novo.setEnabled(true);
                btn_p_Editar.setEnabled(true);
                btn_p_Excluir.setEnabled(true);
                
                btn_p_Salvar.setEnabled(false);
                btn_p_Cancelar.setEnabled(false);
                
                input_p_Cpf.setEnabled(false);
                input_p_Nome.setEnabled(false);
                input_p_Endereco.setEnabled(false);
                break;    
                
            default: System.out.println("Modo inválido");
        } 
    }
    
    public void tabelaPacientes(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"CPF", "NOME", "ENDEREÇO"},0);
        
        for(int i=0;i<listaPacientes.size();i++){
            Object linha[] = new Object[]{listaPacientes.get(i).getCpf_p(),
                                          listaPacientes.get(i).getNome_p(),
                                          listaPacientes.get(i).getEndereco_p()};                             
            modelo.addRow(linha);
            }
        
        tablePacientes.setModel(modelo);
    }
    
    public void ManipulaInterface_c(){
        switch(modo_c){
            case "Navegar":
                btn_c_Novo.setEnabled(true);
                btn_c_Editar.setEnabled(false);
                btn_c_Excluir.setEnabled(false);
                
                btn_c_Salvar.setEnabled(false);
                btn_c_Cancelar.setEnabled(false);
                
                input_c_Cpf.setEnabled(false);
                input_c_Crm.setEnabled(false);
                input_c_Status.setEnabled(false);
                input_c_Data.setEnabled(false);
                input_c_Horario.setEnabled(false);
                input_c_Codigo.setEnabled(false);
                break;
                
            case "Novo":
                btn_c_Novo.setEnabled(false);
                btn_c_Editar.setEnabled(false);
                btn_c_Excluir.setEnabled(false);
                
                btn_c_Salvar.setEnabled(true);
                btn_c_Cancelar.setEnabled(true);
                
                input_c_Cpf.setEnabled(true);
                input_c_Crm.setEnabled(true);
                input_c_Status.setEnabled(true);
                input_c_Data.setEnabled(true);
                input_c_Horario.setEnabled(true);
                input_c_Codigo.setEnabled(true);
                break;
                
            case "Editar":
                btn_c_Novo.setEnabled(true);
                btn_c_Editar.setEnabled(false);
                btn_c_Excluir.setEnabled(false);
                
                btn_c_Salvar.setEnabled(true);
                btn_c_Cancelar.setEnabled(true);
                
                input_c_Cpf.setEnabled(true);
                input_c_Crm.setEnabled(true);
                input_c_Status.setEnabled(true);
                input_c_Data.setEnabled(true);
                input_c_Horario.setEnabled(true);
                input_c_Codigo.setEnabled(true);
                break;
                
            case "Excluir":
                btn_c_Novo.setEnabled(true);
                btn_c_Editar.setEnabled(false);
                btn_c_Excluir.setEnabled(false);
                
                btn_c_Salvar.setEnabled(false);
                btn_c_Cancelar.setEnabled(false);
                
                input_c_Cpf.setEnabled(false);
                input_c_Crm.setEnabled(false);
                input_c_Status.setEnabled(false);
                input_c_Data.setEnabled(false);
                input_c_Horario.setEnabled(false);
                input_c_Codigo.setEnabled(false);
                break;
                
            case "Selecao":
                btn_c_Novo.setEnabled(true);
                btn_c_Editar.setEnabled(true);
                btn_c_Excluir.setEnabled(true);
                
                btn_c_Salvar.setEnabled(false);
                btn_c_Cancelar.setEnabled(false);
                
                input_c_Cpf.setEnabled(false);
                input_c_Crm.setEnabled(false);
                input_c_Status.setEnabled(false);
                input_c_Data.setEnabled(false);
                input_c_Horario.setEnabled(false);
                input_c_Codigo.setEnabled(false);
                break;    
                
            default: System.out.println("Modo inválido");
        } 
    }
    
    public void tabelaConsultas(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"CÓDIGO", "DATA", "HORÁRIO", "CRM", "CPF", "STATUS"},0);
        
        for(int i=0;i<listaConsultas.size();i++){
            Object linha[] = new Object[]{listaConsultas.get(i).getCod_consulta(),
                                          listaConsultas.get(i).getData_consulta(),
                                          listaConsultas.get(i).getHorario_consulta(),
                                          listaConsultas.get(i).getCrm_consulta(),
                                          listaConsultas.get(i).getCpf_consulta(),
                                          listaConsultas.get(i).getStatus_consulta()};                             
            modelo.addRow(linha);
            }
        
        tableConsultas.setModel(modelo);
    }
    
    public telaMenu() {
        initComponents();
        
        listaMedicos = new ArrayList();
        modo_m = "Navegar";
        ManipulaInterface_m();
        
        listaPacientes = new ArrayList();
        modo_p = "Navegar";
        ManipulaInterface_p();
        
        listaConsultas = new ArrayList();
        modo_c = "Navegar";
        ManipulaInterface_c();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        abas = new javax.swing.JTabbedPane();
        abaMedicos = new javax.swing.JPanel();
        lblCrm = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        input_m_Crm = new javax.swing.JTextField();
        input_m_Cpf = new javax.swing.JTextField();
        input_m_Nome = new javax.swing.JTextField();
        input_m_Endereco = new javax.swing.JTextField();
        input_m_Status = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMedicos = new javax.swing.JTable();
        btn_m_Salvar = new javax.swing.JButton();
        btn_m_Cancelar = new javax.swing.JButton();
        btn_m_Editar = new javax.swing.JButton();
        btn_m_Novo = new javax.swing.JButton();
        btn_m_Excluir = new javax.swing.JButton();
        abaPacientes = new javax.swing.JPanel();
        lblCpfP = new javax.swing.JLabel();
        input_p_Cpf = new javax.swing.JTextField();
        lblNomeP = new javax.swing.JLabel();
        input_p_Nome = new javax.swing.JTextField();
        lblEnderecoP = new javax.swing.JLabel();
        input_p_Endereco = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePacientes = new javax.swing.JTable();
        btn_p_Salvar = new javax.swing.JButton();
        btn_p_Cancelar = new javax.swing.JButton();
        btn_p_Novo = new javax.swing.JButton();
        btn_p_Editar = new javax.swing.JButton();
        btn_p_Excluir = new javax.swing.JButton();
        abaConsultas = new javax.swing.JPanel();
        lbl_c_Codigo = new javax.swing.JLabel();
        input_c_Codigo = new javax.swing.JTextField();
        lbl_c_Data = new javax.swing.JLabel();
        input_c_Data = new javax.swing.JTextField();
        lbl_c_Horario = new javax.swing.JLabel();
        input_c_Horario = new javax.swing.JTextField();
        lbl_c_Crm = new javax.swing.JLabel();
        input_c_Crm = new javax.swing.JTextField();
        lbl_c_Cpf = new javax.swing.JLabel();
        input_c_Cpf = new javax.swing.JTextField();
        lbl_c_Status = new javax.swing.JLabel();
        input_c_Status = new javax.swing.JTextField();
        btn_c_Salvar = new javax.swing.JButton();
        btn_c_Cancelar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableConsultas = new javax.swing.JTable();
        btn_c_Novo = new javax.swing.JButton();
        btn_c_Editar = new javax.swing.JButton();
        btn_c_Excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCrm.setText("CRM: ");

        lblCpf.setText("CPF: ");

        lblNome.setText("NOME:");

        lblEndereco.setText("ENDEREÇO:");

        lblStatus.setText("STATUS:");

        input_m_Endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_m_EnderecoActionPerformed(evt);
            }
        });

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tableMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CRM", "CPF", "NOME", "ENDEREÇO", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMedicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMedicosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMedicos);
        if (tableMedicos.getColumnModel().getColumnCount() > 0) {
            tableMedicos.getColumnModel().getColumn(2).setResizable(false);
            tableMedicos.getColumnModel().getColumn(4).setResizable(false);
        }

        btn_m_Salvar.setText("SALVAR");
        btn_m_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_m_SalvarActionPerformed(evt);
            }
        });

        btn_m_Cancelar.setText("CANCELAR");
        btn_m_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_m_CancelarActionPerformed(evt);
            }
        });

        btn_m_Editar.setText("EDITAR");
        btn_m_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_m_EditarActionPerformed(evt);
            }
        });

        btn_m_Novo.setText("NOVO");
        btn_m_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_m_NovoActionPerformed(evt);
            }
        });

        btn_m_Excluir.setText("EXCLUIR");
        btn_m_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_m_ExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout abaMedicosLayout = new javax.swing.GroupLayout(abaMedicos);
        abaMedicos.setLayout(abaMedicosLayout);
        abaMedicosLayout.setHorizontalGroup(
            abaMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaMedicosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(abaMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaMedicosLayout.createSequentialGroup()
                        .addComponent(btn_m_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btn_m_Cancelar)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaMedicosLayout.createSequentialGroup()
                        .addGroup(abaMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(abaMedicosLayout.createSequentialGroup()
                                .addComponent(lblStatus)
                                .addGap(38, 38, 38)
                                .addComponent(input_m_Status))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaMedicosLayout.createSequentialGroup()
                                .addComponent(lblEndereco)
                                .addGap(22, 22, 22)
                                .addComponent(input_m_Endereco))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaMedicosLayout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(input_m_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaMedicosLayout.createSequentialGroup()
                                .addComponent(lblCpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(input_m_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(abaMedicosLayout.createSequentialGroup()
                                .addComponent(lblCrm)
                                .addGap(51, 51, 51)
                                .addComponent(input_m_Crm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaMedicosLayout.createSequentialGroup()
                        .addGroup(abaMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_m_Excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_m_Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_m_Novo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(74, 74, 74)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        abaMedicosLayout.setVerticalGroup(
            abaMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaMedicosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(abaMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCrm)
                    .addComponent(input_m_Crm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(abaMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(input_m_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(abaMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(input_m_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(abaMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(input_m_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(abaMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(input_m_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(abaMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_m_Salvar)
                    .addComponent(btn_m_Cancelar))
                .addGap(43, 43, 43)
                .addComponent(btn_m_Novo)
                .addGap(18, 18, 18)
                .addComponent(btn_m_Editar)
                .addGap(18, 18, 18)
                .addComponent(btn_m_Excluir)
                .addContainerGap(26, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        abas.addTab("Médicos", abaMedicos);

        lblCpfP.setText("CPF:");

        lblNomeP.setText("NOME:");

        lblEnderecoP.setText("ENDEREÇO:");

        tablePacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "NOME", "ENDEREÇO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePacientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablePacientes);

        btn_p_Salvar.setText("SALVAR");
        btn_p_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_SalvarActionPerformed(evt);
            }
        });

        btn_p_Cancelar.setText("CANCELAR");
        btn_p_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_CancelarActionPerformed(evt);
            }
        });

        btn_p_Novo.setText("NOVO");
        btn_p_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_NovoActionPerformed(evt);
            }
        });

        btn_p_Editar.setText("EDITAR");
        btn_p_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_EditarActionPerformed(evt);
            }
        });

        btn_p_Excluir.setText("EXCLUIR");
        btn_p_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_ExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout abaPacientesLayout = new javax.swing.GroupLayout(abaPacientes);
        abaPacientes.setLayout(abaPacientesLayout);
        abaPacientesLayout.setHorizontalGroup(
            abaPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaPacientesLayout.createSequentialGroup()
                .addGroup(abaPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, abaPacientesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(abaPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaPacientesLayout.createSequentialGroup()
                                    .addComponent(lblEnderecoP)
                                    .addGap(18, 18, 18))
                                .addGroup(abaPacientesLayout.createSequentialGroup()
                                    .addComponent(lblNomeP)
                                    .addGap(43, 43, 43)))
                            .addGroup(abaPacientesLayout.createSequentialGroup()
                                .addComponent(lblCpfP)
                                .addGap(53, 53, 53)))
                        .addGroup(abaPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(input_p_Cpf, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(input_p_Nome)
                            .addComponent(input_p_Endereco)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, abaPacientesLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(abaPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_p_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_p_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_p_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, abaPacientesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_p_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(btn_p_Cancelar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        abaPacientesLayout.setVerticalGroup(
            abaPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaPacientesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(abaPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpfP)
                    .addComponent(input_p_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(abaPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeP)
                    .addComponent(input_p_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(abaPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnderecoP)
                    .addComponent(input_p_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(abaPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_p_Salvar)
                    .addComponent(btn_p_Cancelar))
                .addGap(42, 42, 42)
                .addComponent(btn_p_Novo)
                .addGap(26, 26, 26)
                .addComponent(btn_p_Editar)
                .addGap(18, 18, 18)
                .addComponent(btn_p_Excluir)
                .addContainerGap(69, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        abas.addTab("Pacientes", abaPacientes);

        lbl_c_Codigo.setText("COD:");

        lbl_c_Data.setText("DATA:");

        input_c_Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_c_DataActionPerformed(evt);
            }
        });

        lbl_c_Horario.setText("HORARIO:");

        lbl_c_Crm.setText("CRM:");

        lbl_c_Cpf.setText("CPF:");

        lbl_c_Status.setText("STATUS:");

        btn_c_Salvar.setText("SALVAR");
        btn_c_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c_SalvarActionPerformed(evt);
            }
        });

        btn_c_Cancelar.setText("CANCELAR");
        btn_c_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c_CancelarActionPerformed(evt);
            }
        });

        jScrollPane3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane3MouseClicked(evt);
            }
        });

        tableConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "DATA", "HORÁRIO", "CRM", "CPF", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableConsultasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableConsultas);

        btn_c_Novo.setText("NOVO");
        btn_c_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c_NovoActionPerformed(evt);
            }
        });

        btn_c_Editar.setText("EDITAR");
        btn_c_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c_EditarActionPerformed(evt);
            }
        });

        btn_c_Excluir.setText("EXCLUIR");
        btn_c_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c_ExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout abaConsultasLayout = new javax.swing.GroupLayout(abaConsultas);
        abaConsultas.setLayout(abaConsultasLayout);
        abaConsultasLayout.setHorizontalGroup(
            abaConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaConsultasLayout.createSequentialGroup()
                .addGroup(abaConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaConsultasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(abaConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(abaConsultasLayout.createSequentialGroup()
                                .addGroup(abaConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_c_Codigo)
                                    .addComponent(lbl_c_Data)
                                    .addComponent(lbl_c_Horario)
                                    .addComponent(lbl_c_Crm)
                                    .addComponent(lbl_c_Cpf)
                                    .addComponent(lbl_c_Status))
                                .addGap(27, 27, 27)
                                .addGroup(abaConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(input_c_Codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(input_c_Data)
                                    .addComponent(input_c_Horario)
                                    .addComponent(input_c_Crm)
                                    .addComponent(input_c_Cpf)
                                    .addComponent(input_c_Status)))
                            .addGroup(abaConsultasLayout.createSequentialGroup()
                                .addComponent(btn_c_Salvar)
                                .addGap(26, 26, 26)
                                .addComponent(btn_c_Cancelar))))
                    .addGroup(abaConsultasLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(abaConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_c_Excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_c_Novo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_c_Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        abaConsultasLayout.setVerticalGroup(
            abaConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaConsultasLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(abaConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_c_Codigo)
                    .addComponent(input_c_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(abaConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_c_Data)
                    .addComponent(input_c_Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(abaConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_c_Horario)
                    .addComponent(input_c_Horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(abaConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_c_Crm)
                    .addComponent(input_c_Crm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(abaConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_c_Cpf)
                    .addComponent(input_c_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(abaConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_c_Status)
                    .addComponent(input_c_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(abaConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_c_Salvar)
                    .addComponent(btn_c_Cancelar))
                .addGap(18, 18, 18)
                .addComponent(btn_c_Novo)
                .addGap(18, 18, 18)
                .addComponent(btn_c_Editar)
                .addGap(18, 18, 18)
                .addComponent(btn_c_Excluir)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaConsultasLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        abas.addTab("Consultas", abaConsultas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(abas, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(abas)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_m_EnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_m_EnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_m_EnderecoActionPerformed

    private void btn_m_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_m_CancelarActionPerformed
        input_m_Cpf.setText("");
        input_m_Nome.setText("");
        input_m_Endereco.setText("");
        input_m_Crm.setText("");
        input_m_Status.setText("");
        
        modo_m = "Navegar";
        ManipulaInterface_m();
    }//GEN-LAST:event_btn_m_CancelarActionPerformed

    private void btn_m_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_m_SalvarActionPerformed
        
        if (modo_m.equals("Novo")){
            Medicos M = new Medicos(input_m_Crm.getText(), input_m_Cpf.getText(), input_m_Nome.getText(), 
                                    input_m_Endereco.getText(), input_m_Status.getText());
            
            listaMedicos.add(M);
        
        } else if (modo_m.equals("Editar")){
            
            int index = tableMedicos.getSelectedRow();
           
            listaMedicos.get(index).setCrm_m(input_m_Crm.getText());
            listaMedicos.get(index).setCpf_m(input_m_Cpf.getText());
            listaMedicos.get(index).setNome_m(input_m_Nome.getText());
            listaMedicos.get(index).setEndereco_m(input_m_Endereco.getText());
            listaMedicos.get(index).setStatus_m(input_m_Status.getText());
        }
        
        tabelaMedicos();
        
        modo_m = "Navegar";
        ManipulaInterface_m();
    }//GEN-LAST:event_btn_m_SalvarActionPerformed

    private void btn_p_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_CancelarActionPerformed
        input_p_Cpf.setText("");
        input_p_Nome.setText("");
        input_p_Endereco.setText("");
        
        modo_p = "Navegar";
        ManipulaInterface_p();
    }//GEN-LAST:event_btn_p_CancelarActionPerformed

    private void input_c_DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_c_DataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_c_DataActionPerformed

    private void btn_c_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c_CancelarActionPerformed
        input_c_Cpf.setText("");
        input_c_Crm.setText("");
        input_c_Horario.setText("");
        input_c_Data.setText("");
        input_c_Codigo.setText("");
        input_c_Status.setText("");
        
        modo_c = "Navegar";
        ManipulaInterface_c();
    }//GEN-LAST:event_btn_c_CancelarActionPerformed

    private void btn_c_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c_NovoActionPerformed
        input_c_Cpf.setText("");
        input_c_Codigo.setText("");
        input_c_Status.setText("");
        input_c_Crm.setText("");
        input_c_Horario.setText("");
        input_c_Data.setText("");
        
        modo_c = "Novo";
        ManipulaInterface_c();
    }//GEN-LAST:event_btn_c_NovoActionPerformed

    private void btn_m_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_m_NovoActionPerformed
        input_m_Cpf.setText("");
        input_m_Nome.setText("");
        input_m_Endereco.setText("");
        input_m_Crm.setText("");
        input_m_Status.setText("");
        
        modo_m = "Novo";
        ManipulaInterface_m();
    }//GEN-LAST:event_btn_m_NovoActionPerformed

    private void btn_m_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_m_EditarActionPerformed
        modo_m = "Editar";
        ManipulaInterface_m();
    }//GEN-LAST:event_btn_m_EditarActionPerformed

    private void btn_m_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_m_ExcluirActionPerformed
        int index_m = tableMedicos.getSelectedRow();
        
        if (index_m >= 0 && index_m < listaMedicos.size()){
            listaMedicos.remove(index_m);
        }
        
        tabelaMedicos();
        
        modo_m = "Navegar";
        ManipulaInterface_m();
        //
        input_m_Cpf.setText("");
        input_m_Nome.setText("");
        input_m_Endereco.setText("");
        input_m_Crm.setText("");
        input_m_Status.setText("");
    }//GEN-LAST:event_btn_m_ExcluirActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
    
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void tableMedicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMedicosMouseClicked
        int index_m = tableMedicos.getSelectedRow();
        
        if (index_m >= 0 && index_m < listaMedicos.size()){
            
            Medicos M = listaMedicos.get(index_m);
            
            input_m_Cpf.setText(M.getCpf_m());
            input_m_Nome.setText(M.getNome_m());
            input_m_Endereco.setText(M.getEndereco_m());
            input_m_Crm.setText(M.getCrm_m());
            input_m_Status.setText(M.getStatus_m());
            
            modo_m = "Selecao";
            ManipulaInterface_m();
        }  
    }//GEN-LAST:event_tableMedicosMouseClicked

    private void btn_p_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_SalvarActionPerformed
        
        if (modo_p.equals("Novo")){
            Pacientes P = new Pacientes(input_p_Cpf.getText(), input_p_Nome.getText(), input_p_Endereco.getText());
            
            listaPacientes.add(P);
        
        } else if (modo_p.equals("Editar")){
            
            int index = tablePacientes.getSelectedRow();
           
            listaPacientes.get(index).setCpf_p(input_p_Cpf.getText());
            listaPacientes.get(index).setNome_p(input_p_Nome.getText());
            listaPacientes.get(index).setEndereco_p(input_p_Endereco.getText());

        }
        
        tabelaPacientes();
        
        modo_p = "Navegar";
        ManipulaInterface_p();
    }//GEN-LAST:event_btn_p_SalvarActionPerformed

    private void btn_p_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_NovoActionPerformed
        input_p_Cpf.setText("");
        input_p_Nome.setText("");
        input_p_Endereco.setText("");
        
        modo_p = "Novo";
        ManipulaInterface_p();
    }//GEN-LAST:event_btn_p_NovoActionPerformed

    private void btn_p_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_EditarActionPerformed
        modo_p = "Editar";
        ManipulaInterface_p();
    }//GEN-LAST:event_btn_p_EditarActionPerformed

    private void btn_p_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_ExcluirActionPerformed
        
        int index_p = tablePacientes.getSelectedRow();
        
        if (index_p >= 0 && index_p < listaPacientes.size()){
            listaPacientes.remove(index_p);
        }
        
        tabelaPacientes();
        
        modo_p = "Navegar";
        ManipulaInterface_p();
        //
        input_p_Cpf.setText("");
        input_p_Nome.setText("");
        input_p_Endereco.setText("");

    }//GEN-LAST:event_btn_p_ExcluirActionPerformed

    private void tablePacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePacientesMouseClicked
        int index_p = tablePacientes.getSelectedRow();
        
        if (index_p >= 0 && index_p < listaPacientes.size()){
            
            Pacientes P = listaPacientes.get(index_p);
            
            input_p_Cpf.setText(P.getCpf_p());
            input_p_Nome.setText(P.getNome_p());
            input_p_Endereco.setText(P.getEndereco_p());
            
            modo_p = "Selecao";
            ManipulaInterface_p();
        }
    }//GEN-LAST:event_tablePacientesMouseClicked

    private void btn_c_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c_SalvarActionPerformed
        if (modo_c.equals("Novo")){
            Consultas C = new Consultas(input_c_Codigo.getText(), input_c_Data.getText(), input_c_Horario.getText(), 
                                    input_c_Crm.getText(), input_c_Cpf.getText(), input_c_Status.getText());
            
            listaConsultas.add(C);
        
        } else if (modo_c.equals("Editar")){
            
            int index = tableConsultas.getSelectedRow();
           
            listaConsultas.get(index).setCod_consulta(input_c_Codigo.getText());
            listaConsultas.get(index).setData_consulta(input_c_Data.getText());
            listaConsultas.get(index).setHorario_consulta(input_c_Horario.getText());
            listaConsultas.get(index).setCrm_consulta(input_c_Crm.getText());
            listaConsultas.get(index).setCpf_consulta(input_c_Cpf.getText());
            listaConsultas.get(index).setStatus_consulta(input_c_Status.getText());
            
        }
        
        tabelaConsultas();
        
        modo_c = "Navegar";
        ManipulaInterface_c();
    }//GEN-LAST:event_btn_c_SalvarActionPerformed

    private void btn_c_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c_EditarActionPerformed
        modo_c = "Editar";
        ManipulaInterface_c();
    }//GEN-LAST:event_btn_c_EditarActionPerformed

    private void btn_c_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c_ExcluirActionPerformed
        int index_c = tableConsultas.getSelectedRow();
        
        if (index_c >= 0 && index_c < listaConsultas.size()){
            listaConsultas.remove(index_c);
        }
        
        tabelaConsultas();
        
        modo_c = "Navegar";
        ManipulaInterface_c();
        //
        input_c_Cpf.setText("");
        input_c_Crm.setText("");
        input_c_Horario.setText("");
        input_c_Data.setText("");
        input_c_Status.setText("");
        input_c_Codigo.setText("");
        
    }//GEN-LAST:event_btn_c_ExcluirActionPerformed

    private void jScrollPane3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane3MouseClicked

    private void tableConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableConsultasMouseClicked
        int index_c = tableConsultas.getSelectedRow();
        
        if (index_c >= 0 && index_c < listaConsultas.size()){
            
            Consultas C = listaConsultas.get(index_c);
            
            input_c_Cpf.setText(C.getCpf_consulta());
            input_c_Codigo.setText(C.getCod_consulta());
            input_c_Status.setText(C.getStatus_consulta());
            input_c_Crm.setText(C.getCrm_consulta());
            input_c_Data.setText(C.getData_consulta());
            input_c_Horario.setText(C.getHorario_consulta());
            
            modo_c = "Selecao";
            ManipulaInterface_c();
        }
    }//GEN-LAST:event_tableConsultasMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abaConsultas;
    private javax.swing.JPanel abaMedicos;
    private javax.swing.JPanel abaPacientes;
    private javax.swing.JTabbedPane abas;
    private javax.swing.JButton btn_c_Cancelar;
    private javax.swing.JButton btn_c_Editar;
    private javax.swing.JButton btn_c_Excluir;
    private javax.swing.JButton btn_c_Novo;
    private javax.swing.JButton btn_c_Salvar;
    private javax.swing.JButton btn_m_Cancelar;
    private javax.swing.JButton btn_m_Editar;
    private javax.swing.JButton btn_m_Excluir;
    private javax.swing.JButton btn_m_Novo;
    private javax.swing.JButton btn_m_Salvar;
    private javax.swing.JButton btn_p_Cancelar;
    private javax.swing.JButton btn_p_Editar;
    private javax.swing.JButton btn_p_Excluir;
    private javax.swing.JButton btn_p_Novo;
    private javax.swing.JButton btn_p_Salvar;
    private javax.swing.JTextField input_c_Codigo;
    private javax.swing.JTextField input_c_Cpf;
    private javax.swing.JTextField input_c_Crm;
    private javax.swing.JTextField input_c_Data;
    private javax.swing.JTextField input_c_Horario;
    private javax.swing.JTextField input_c_Status;
    private javax.swing.JTextField input_m_Cpf;
    private javax.swing.JTextField input_m_Crm;
    private javax.swing.JTextField input_m_Endereco;
    private javax.swing.JTextField input_m_Nome;
    private javax.swing.JTextField input_m_Status;
    private javax.swing.JTextField input_p_Cpf;
    private javax.swing.JTextField input_p_Endereco;
    private javax.swing.JTextField input_p_Nome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblCpfP;
    private javax.swing.JLabel lblCrm;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEnderecoP;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeP;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lbl_c_Codigo;
    private javax.swing.JLabel lbl_c_Cpf;
    private javax.swing.JLabel lbl_c_Crm;
    private javax.swing.JLabel lbl_c_Data;
    private javax.swing.JLabel lbl_c_Horario;
    private javax.swing.JLabel lbl_c_Status;
    private javax.swing.JTable tableConsultas;
    private javax.swing.JTable tableMedicos;
    private javax.swing.JTable tablePacientes;
    // End of variables declaration//GEN-END:variables
}
