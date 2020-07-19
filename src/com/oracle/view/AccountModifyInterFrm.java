/*
 * AccountModify.java
 *
 * Created on __DATE__, __TIME__
 */

package com.oracle.view;

import java.sql.Connection;

import javax.swing.JOptionPane;

import com.oracle.dao.UserDao;
import com.oracle.model.User;
import com.oracle.util.DbUtil;
import com.oracle.util.StringUtil;

/**
 *
 * @author  __USER__
 */
public class AccountModifyInterFrm extends javax.swing.JInternalFrame {
	DbUtil dbUtil = new DbUtil();
	UserDao userDao = new UserDao();

	/** Creates new form AccountModify */
	public AccountModifyInterFrm() {
		initComponents();
		this.setLocation(320, 100);
		this.userNameTxt.setText(LogOnFrm.s_currentUser.getUserName());
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jb_modify = new javax.swing.JButton();
		jb_reset = new javax.swing.JButton();
		userNameTxt = new javax.swing.JTextField();
		oldPasswordTxt = new javax.swing.JPasswordField();
		newPasswordTxt = new javax.swing.JPasswordField();
		newPasswordConfirmTxt = new javax.swing.JPasswordField();

		setClosable(true);
		setIconifiable(true);
		setTitle("\u8d26\u6237\u4fe1\u606f\u4fee\u6539");

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/userName.png"))); // NOI18N
		jLabel1.setText("\u7528\u6237\u540d\uff1a");

		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/password.png"))); // NOI18N
		jLabel2.setText("\u65e7\u5bc6\u7801\uff1a");

		jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/new_password.png"))); // NOI18N
		jLabel3.setText("\u65b0\u5bc6\u7801\uff1a");

		jLabel4.setText("\u65b0\u5bc6\u7801\u786e\u8ba4\uff1a");

		jb_modify.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/edit.png"))); // NOI18N
		jb_modify.setText("\u786e\u8ba4\u4fee\u6539");
		jb_modify.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jb_modifyActionPerformed(evt);
			}
		});

		jb_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/reset.png"))); // NOI18N
		jb_reset.setText("\u91cd\u7f6e");
		jb_reset.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jb_resetActionPerformed(evt);
			}
		});

		userNameTxt.setEnabled(false);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				37,
																				37,
																				37)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel1)
																						.addComponent(
																								jLabel2)
																						.addComponent(
																								jLabel3)
																						.addComponent(
																								jLabel4))
																		.addGap(
																				35,
																				35,
																				35)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addComponent(
																								newPasswordConfirmTxt,
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								newPasswordTxt,
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								oldPasswordTxt,
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								userNameTxt,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								127,
																								Short.MAX_VALUE)))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				47,
																				47,
																				47)
																		.addComponent(
																				jb_modify)
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				jb_reset,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)))
										.addContainerGap(65, Short.MAX_VALUE)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout
										.createSequentialGroup()
										.addGap(41, 41, 41)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(
																userNameTxt,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(
																oldPasswordTxt,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(
																newPasswordTxt,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(12, 12, 12)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(
																newPasswordConfirmTxt,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(30, 30, 30)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jb_modify)
														.addComponent(jb_reset))
										.addGap(40, 40, 40)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jb_modifyActionPerformed(java.awt.event.ActionEvent evt) {
		String oldPassword = new String(this.oldPasswordTxt.getPassword());
		String newPassword1 = new String(this.newPasswordTxt.getPassword());
		String newPassword2 = new String(this.newPasswordConfirmTxt
				.getPassword());
		if (StringUtil.isEmpty(oldPassword)) {
			JOptionPane.showMessageDialog(null, "旧密码不能为空！");
			return;
		}
		if (StringUtil.isEmpty(newPassword1)
				|| StringUtil.isEmpty(newPassword2)) {
			JOptionPane.showMessageDialog(null, "新密码不能为空！");
			return;
		}
		if (!newPassword1.equals(newPassword2)) {
			JOptionPane.showMessageDialog(null, "两次输入的密码不一致！");
			return;
		}
		User user = null;
		Connection con = null;
		try {
			con = dbUtil.getCon();
			user = new User(LogOnFrm.s_currentUser.getUserName(), oldPassword);
			if (userDao.login(con, user) != null) {
				user.setPassword(newPassword1);
				user.setId(LogOnFrm.s_currentUser.getId());
				int modifyNum = userDao.userModify(con, user);
				if (1 == modifyNum) {
					JOptionPane.showMessageDialog(null, "修改成功！");
					this.oldPasswordTxt.setText("");
					this.newPasswordTxt.setText("");
					this.newPasswordConfirmTxt.setText("");
				} else {
					JOptionPane.showMessageDialog(null, "修改失败，请重新输入");
				}
			} else {
				JOptionPane.showMessageDialog(null, "旧密码错误！请重新输入");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dbUtil.closeCon(con);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void jb_resetActionPerformed(java.awt.event.ActionEvent evt) {
		this.oldPasswordTxt.setText("");
		this.newPasswordTxt.setText("");
		this.newPasswordConfirmTxt.setText("");
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JButton jb_modify;
	private javax.swing.JButton jb_reset;
	private javax.swing.JPasswordField newPasswordConfirmTxt;
	private javax.swing.JPasswordField newPasswordTxt;
	private javax.swing.JPasswordField oldPasswordTxt;
	private javax.swing.JTextField userNameTxt;
}