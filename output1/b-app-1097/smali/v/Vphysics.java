public class v.Vphysics extends v.V {
	 /* .source "Vphysics.java" */
	 /* # instance fields */
	 v.Vphob m_all;
	 public Boolean m_noAngularUpdate;
	 /* # direct methods */
	 public v.Vphysics ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 5 */
		 /* invoke-direct {p0}, Lv/V;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void add ( v.Vphob p0 ) {
		 /* .locals 1 */
		 /* .param p1, "p" # Lv/Vphob; */
		 /* .prologue */
		 /* .line 13 */
		 v0 = this.m_all;
		 this.m_next = v0;
		 /* .line 14 */
		 this.m_all = p1;
		 /* .line 15 */
		 return;
	 } // .end method
	 public void remove ( v.Vphob p0 ) {
		 /* .locals 3 */
		 /* .param p1, "p" # Lv/Vphob; */
		 /* .prologue */
		 /* .line 18 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 19 */
		 /* .local v0, "prior":Lv/Vphob; */
		 v1 = this.m_all;
		 /* .line 20 */
		 /* .local v1, "q":Lv/Vphob; */
	 } // :goto_0
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* if-ne p1, v1, :cond_1 */
		 /* .line 32 */
	 } // :cond_0
} // :goto_1
return;
/* .line 21 */
} // :cond_1
/* if-ne p1, v1, :cond_3 */
/* .line 22 */
/* if-nez v0, :cond_2 */
/* .line 23 */
v2 = this.m_next;
this.m_all = v2;
/* .line 25 */
} // :cond_2
v2 = this.m_next;
this.m_next = v2;
/* .line 29 */
} // :cond_3
/* move-object v0, v1 */
/* .line 30 */
v1 = this.m_next;
} // .end method
public void step ( Integer p0 ) {
/* .locals 20 */
/* .param p1, "millisec" # I */
/* .prologue */
/* .line 41 */
/* if-lez p1, :cond_0 */
/* const/16 v19, 0xc8 */
/* move/from16 v0, p1 */
/* move/from16 v1, v19 */
/* if-le v0, v1, :cond_1 */
/* .line 42 */
} // :cond_0
/* const/16 p1, 0xc8 */
/* .line 45 */
} // :cond_1
/* shl-int/lit8 v13, p1, 0x5 */
/* .line 47 */
/* .local v13, "tsecs":I */
/* shr-int/lit8 v14, v13, 0x1 */
/* .line 49 */
/* .local v14, "tsecsh":I */
/* move-object/from16 v0, p0 */
v0 = this.m_all;
/* move-object v5, v0 */
/* .local v5, "p":Lv/Vphob; */
} // :goto_0
/* if-nez v5, :cond_2 */
/* .line 52 */
int v4 = 0; // const/4 v4, 0x0
/* .line 54 */
/* .local v4, "nbackup":I */
} // :goto_1
/* if-gtz v13, :cond_3 */
/* .line 255 */
return;
/* .line 50 */
} // .end local v4 # "nbackup":I
} // :cond_2
(( v.Vphob ) v5 ).calcForces ( ); // invoke-virtual {v5}, Lv/Vphob;->calcForces()V
/* .line 49 */
v5 = this.m_next;
/* .line 55 */
/* .restart local v4 # "nbackup":I */
} // :cond_3
/* move v12, v13 */
/* .line 61 */
/* .local v12, "t":I */
/* move-object/from16 v0, p0 */
v0 = this.m_all;
/* move-object v5, v0 */
} // :goto_2
/* if-nez v5, :cond_6 */
/* .line 68 */
} // :goto_3
/* move-object/from16 v0, p0 */
v0 = this.m_all;
/* move-object v5, v0 */
} // :goto_4
/* if-nez v5, :cond_8 */
/* .line 76 */
/* move v3, v12 */
/* .line 117 */
/* .local v3, "ctime":I */
/* move-object/from16 v0, p0 */
v0 = this.m_all;
/* move-object v5, v0 */
} // :goto_5
/* if-nez v5, :cond_a */
/* .line 181 */
/* if-nez v3, :cond_4 */
/* .line 182 */
int v3 = 1; // const/4 v3, 0x1
/* .line 184 */
} // :cond_4
/* if-lt v3, v12, :cond_14 */
/* .line 232 */
} // :goto_6
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lv/Vphysics;->m_noAngularUpdate:Z */
/* move/from16 v19, v0 */
/* if-nez v19, :cond_5 */
/* .line 233 */
/* move-object/from16 v0, p0 */
v0 = this.m_all;
/* move-object v5, v0 */
} // :goto_7
/* if-nez v5, :cond_18 */
/* .line 239 */
} // :cond_5
/* sub-int/2addr v13, v12 */
/* .line 62 */
} // .end local v3 # "ctime":I
} // :cond_6
/* move-object v0, v5 */
v0 = this.m_parent;
/* move-object/from16 v19, v0 */
if ( v19 != null) { // if-eqz v19, :cond_7
/* .line 63 */
(( v.Vphob ) v5 ).stateSave ( ); // invoke-virtual {v5}, Lv/Vphob;->stateSave()V
/* .line 61 */
} // :cond_7
v5 = this.m_next;
/* .line 69 */
} // :cond_8
/* move-object v0, v5 */
v0 = this.m_parent;
/* move-object/from16 v19, v0 */
if ( v19 != null) { // if-eqz v19, :cond_9
/* .line 70 */
(( v.Vphob ) v5 ).step ( v12 ); // invoke-virtual {v5, v12}, Lv/Vphob;->step(I)V
/* .line 68 */
} // :cond_9
v5 = this.m_next;
/* .line 118 */
/* .restart local v3 # "ctime":I */
} // :cond_a
/* move-object v0, v5 */
v0 = this.m_parent;
/* move-object/from16 v19, v0 */
if ( v19 != null) { // if-eqz v19, :cond_b
/* .line 122 */
/* iget v7, v5, Lv/Vphob;->m_vx0:I */
/* .line 123 */
/* .local v7, "px0":I */
/* iget v9, v5, Lv/Vphob;->m_vz0:I */
/* .line 124 */
/* .local v9, "pz0":I */
/* iget v8, v5, Lv/Vphob;->m_vx1:I */
/* .line 125 */
/* .local v8, "px1":I */
/* iget v10, v5, Lv/Vphob;->m_vz1:I */
/* .line 126 */
/* .local v10, "pz1":I */
/* move-object v0, v5 */
v0 = this.m_velocity;
/* move-object/from16 v19, v0 */
/* move-object/from16 v0, v19 */
/* iget v0, v0, Lv/Vector;->m_x:I */
/* move/from16 v19, v0 */
/* if-nez v19, :cond_c */
/* move-object v0, v5 */
v0 = this.m_velocity;
/* move-object/from16 v19, v0 */
/* move-object/from16 v0, v19 */
/* iget v0, v0, Lv/Vector;->m_z:I */
/* move/from16 v19, v0 */
/* if-nez v19, :cond_c */
/* const/16 v19, 0x0 */
/* move/from16 v6, v19 */
/* .line 128 */
/* .local v6, "pv":Z */
} // :goto_8
v11 = this.m_next;
/* .local v11, "q":Lv/Vphob; */
} // :goto_9
/* if-nez v11, :cond_d */
/* .line 174 */
v2 = (( v.Vphob ) v5 ).collisionCheckEnvironment ( v12 ); // invoke-virtual {v5, v12}, Lv/Vphob;->collisionCheckEnvironment(I)I
/* .line 175 */
/* .local v2, "ct":I */
/* if-ge v2, v3, :cond_b */
/* .line 176 */
/* move v3, v2 */
/* .line 117 */
} // .end local v2 # "ct":I
} // .end local v6 # "pv":Z
} // .end local v7 # "px0":I
} // .end local v8 # "px1":I
} // .end local v9 # "pz0":I
} // .end local v10 # "pz1":I
} // .end local v11 # "q":Lv/Vphob;
} // :cond_b
v5 = this.m_next;
/* .line 126 */
/* .restart local v7 # "px0":I */
/* .restart local v8 # "px1":I */
/* .restart local v9 # "pz0":I */
/* .restart local v10 # "pz1":I */
} // :cond_c
/* const/16 v19, 0x1 */
/* move/from16 v6, v19 */
/* .line 129 */
/* .restart local v6 # "pv":Z */
/* .restart local v11 # "q":Lv/Vphob; */
} // :cond_d
/* move-object v0, v11 */
v0 = this.m_parent;
/* move-object/from16 v19, v0 */
if ( v19 != null) { // if-eqz v19, :cond_13
/* .line 130 */
/* if-nez v6, :cond_e */
/* move-object v0, v11 */
v0 = this.m_velocity;
/* move-object/from16 v19, v0 */
/* move-object/from16 v0, v19 */
/* iget v0, v0, Lv/Vector;->m_x:I */
/* move/from16 v19, v0 */
/* if-nez v19, :cond_e */
/* move-object v0, v11 */
v0 = this.m_velocity;
/* move-object/from16 v19, v0 */
/* move-object/from16 v0, v19 */
/* iget v0, v0, Lv/Vector;->m_z:I */
/* move/from16 v19, v0 */
if ( v19 != null) { // if-eqz v19, :cond_13
/* .line 134 */
} // :cond_e
/* move-object v0, v11 */
/* iget v0, v0, Lv/Vphob;->m_vz0:I */
/* move/from16 v17, v0 */
/* .line 135 */
/* .local v17, "z0":I */
/* move/from16 v0, v17 */
/* move v1, v9 */
/* if-ge v0, v1, :cond_f */
/* .line 136 */
/* move/from16 v17, v9 */
/* .line 138 */
} // :cond_f
/* move-object v0, v11 */
/* iget v0, v0, Lv/Vphob;->m_vz1:I */
/* move/from16 v18, v0 */
/* .line 139 */
/* .local v18, "z1":I */
/* move/from16 v0, v18 */
/* move v1, v10 */
/* if-le v0, v1, :cond_10 */
/* .line 140 */
/* move/from16 v18, v10 */
/* .line 142 */
} // :cond_10
/* move/from16 v0, v17 */
/* move/from16 v1, v18 */
/* if-ge v0, v1, :cond_13 */
/* .line 143 */
/* iget v15, v11, Lv/Vphob;->m_vx0:I */
/* .line 144 */
/* .local v15, "x0":I */
/* if-ge v15, v7, :cond_11 */
/* .line 145 */
/* move v15, v7 */
/* .line 147 */
} // :cond_11
/* move-object v0, v11 */
/* iget v0, v0, Lv/Vphob;->m_vx1:I */
/* move/from16 v16, v0 */
/* .line 148 */
/* .local v16, "x1":I */
/* move/from16 v0, v16 */
/* move v1, v8 */
/* if-le v0, v1, :cond_12 */
/* .line 149 */
/* move/from16 v16, v8 */
/* .line 151 */
} // :cond_12
/* move v0, v15 */
/* move/from16 v1, v16 */
/* if-ge v0, v1, :cond_13 */
/* .line 153 */
v2 = (( v.Vphob ) v5 ).collisionCheckObject ( v11, v12 ); // invoke-virtual {v5, v11, v12}, Lv/Vphob;->collisionCheckObject(Lv/Vphob;I)I
/* .line 155 */
/* .restart local v2 # "ct":I */
/* if-ge v2, v3, :cond_13 */
/* .line 159 */
/* move v3, v2 */
/* .line 128 */
} // .end local v2 # "ct":I
} // .end local v15 # "x0":I
} // .end local v16 # "x1":I
} // .end local v17 # "z0":I
} // .end local v18 # "z1":I
} // :cond_13
v11 = this.m_next;
/* .line 206 */
} // .end local v6 # "pv":Z
} // .end local v7 # "px0":I
} // .end local v8 # "px1":I
} // .end local v9 # "pz0":I
} // .end local v10 # "pz1":I
} // .end local v11 # "q":Lv/Vphob;
} // :cond_14
/* move-object/from16 v0, p0 */
v0 = this.m_all;
/* move-object v5, v0 */
} // :goto_a
/* if-nez v5, :cond_15 */
/* .line 212 */
/* add-int/lit8 v4, v4, 0x1 */
/* .line 222 */
/* const/16 v19, 0x3e8 */
/* move v0, v4 */
/* move/from16 v1, v19 */
/* if-le v0, v1, :cond_17 */
/* .line 224 */
int v13 = 0; // const/4 v13, 0x0
/* .line 225 */
/* goto/16 :goto_6 */
/* .line 208 */
} // :cond_15
/* move-object v0, v5 */
v0 = this.m_parent;
/* move-object/from16 v19, v0 */
if ( v19 != null) { // if-eqz v19, :cond_16
/* .line 209 */
(( v.Vphob ) v5 ).stateRestore ( ); // invoke-virtual {v5}, Lv/Vphob;->stateRestore()V
/* .line 206 */
} // :cond_16
v5 = this.m_next;
/* .line 228 */
} // :cond_17
/* move v12, v3 */
/* .line 66 */
/* goto/16 :goto_3 */
/* .line 235 */
} // :cond_18
/* move-object v0, v5 */
v0 = this.m_parent;
/* move-object/from16 v19, v0 */
if ( v19 != null) { // if-eqz v19, :cond_19
/* .line 236 */
(( v.Vphob ) v5 ).stepAngular ( v12 ); // invoke-virtual {v5, v12}, Lv/Vphob;->stepAngular(I)V
/* .line 233 */
} // :cond_19
v5 = this.m_next;
/* goto/16 :goto_7 */
} // .end method
