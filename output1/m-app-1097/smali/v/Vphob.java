public class v.Vphob extends v.Vsprite {
	 /* .source "Vphob.java" */
	 /* # static fields */
	 public static final Integer COLLISION_TOLERANCE;
	 public static final Integer COLLISION_TOLERANCE_SQUARED;
	 public static final Integer COLLISION_TOLERANCE_Z;
	 public static final Boolean FLAT;
	 public static final Integer GRAVITY;
	 static final Boolean XZRECT;
	 public static final Integer m_drag;
	 /* # instance fields */
	 public v.Vector m_acceleration;
	 v.Vector m_angularVelocity;
	 public Boolean m_collided;
	 public v.Vector m_collisionNormal;
	 v.Vector m_collisionTangent;
	 v.Vector m_forces;
	 public Integer m_gravity;
	 public Integer m_inverseCircumference;
	 v.Vphob m_next;
	 public Integer m_pHeight;
	 public v.Vector m_position;
	 public v.Vector m_position0;
	 v.Vquaternion m_qOrientation;
	 v.Vquaternion m_qt;
	 public Integer m_radius;
	 public Integer m_speed;
	 public v.Vector m_u;
	 public v.Vector m_v;
	 public v.Vector m_velocity;
	 v.Vector m_velocity0;
	 Integer m_vx0;
	 Integer m_vx1;
	 Integer m_vz0;
	 Integer m_vz1;
	 /* # direct methods */
	 public v.Vphob ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 96 */
		 /* invoke-direct {p0}, Lv/Vsprite;-><init>()V */
		 /* .line 97 */
		 /* new-instance v0, Lv/Vector; */
		 /* invoke-direct {v0}, Lv/Vector;-><init>()V */
		 this.m_acceleration = v0;
		 /* .line 98 */
		 /* new-instance v0, Lv/Vector; */
		 /* invoke-direct {v0}, Lv/Vector;-><init>()V */
		 this.m_angularVelocity = v0;
		 /* .line 99 */
		 /* new-instance v0, Lv/Vector; */
		 /* invoke-direct {v0}, Lv/Vector;-><init>()V */
		 this.m_collisionNormal = v0;
		 /* .line 100 */
		 /* new-instance v0, Lv/Vector; */
		 /* invoke-direct {v0}, Lv/Vector;-><init>()V */
		 this.m_collisionTangent = v0;
		 /* .line 101 */
		 /* new-instance v0, Lv/Vector; */
		 /* invoke-direct {v0}, Lv/Vector;-><init>()V */
		 this.m_forces = v0;
		 /* .line 102 */
		 /* const v0, -0xc5ad4d */
		 /* iput v0, p0, Lv/Vphob;->m_gravity:I */
		 /* .line 103 */
		 /* new-instance v0, Lv/Vector; */
		 /* invoke-direct {v0}, Lv/Vector;-><init>()V */
		 this.m_position = v0;
		 /* .line 104 */
		 /* new-instance v0, Lv/Vector; */
		 /* invoke-direct {v0}, Lv/Vector;-><init>()V */
		 this.m_position0 = v0;
		 /* .line 105 */
		 /* new-instance v0, Lv/Vquaternion; */
		 /* invoke-direct {v0}, Lv/Vquaternion;-><init>()V */
		 this.m_qt = v0;
		 /* .line 106 */
		 /* new-instance v0, Lv/Vquaternion; */
		 /* invoke-direct {v0}, Lv/Vquaternion;-><init>()V */
		 this.m_qOrientation = v0;
		 /* .line 107 */
		 /* new-instance v0, Lv/Vector; */
		 /* invoke-direct {v0}, Lv/Vector;-><init>()V */
		 this.m_u = v0;
		 /* .line 108 */
		 /* new-instance v0, Lv/Vector; */
		 /* invoke-direct {v0}, Lv/Vector;-><init>()V */
		 this.m_v = v0;
		 /* .line 109 */
		 /* new-instance v0, Lv/Vector; */
		 /* invoke-direct {v0}, Lv/Vector;-><init>()V */
		 this.m_velocity = v0;
		 /* .line 110 */
		 /* new-instance v0, Lv/Vector; */
		 /* invoke-direct {v0}, Lv/Vector;-><init>()V */
		 this.m_velocity0 = v0;
		 /* .line 111 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void calcForces ( ) {
		 /* .locals 4 */
		 /* .prologue */
		 int v3 = 0; // const/4 v3, 0x0
		 /* .line 114 */
		 v1 = this.m_velocity;
		 v1 = 		 (( v.Vector ) v1 ).magnitudeApprox ( ); // invoke-virtual {v1}, Lv/Vector;->magnitudeApprox()I
		 /* iput v1, p0, Lv/Vphob;->m_speed:I */
		 /* .line 116 */
		 /* iget v1, p0, Lv/Vphob;->m_speed:I */
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 /* .line 118 */
			 v1 = this.m_forces;
			 v2 = this.m_velocity;
			 (( v.Vector ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Lv/Vector;->set(Lv/Vector;)V
			 /* .line 120 */
			 v1 = this.m_forces;
			 (( v.Vector ) v1 ).negate ( ); // invoke-virtual {v1}, Lv/Vector;->negate()V
			 /* .line 124 */
			 int v1 = 1; // const/4 v1, 0x1
			 /* iget v2, p0, Lv/Vphob;->m_speed:I */
			 v1 = 			 v.Vphob .fmul ( v1,v2 );
			 /* iget v2, p0, Lv/Vphob;->m_speed:I */
			 v0 = 			 v.Vphob .fmul ( v1,v2 );
			 /* .line 125 */
			 /* .local v0, "t":I */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 126 */
				 v1 = this.m_forces;
				 (( v.Vector ) v1 ).multiply ( v0 ); // invoke-virtual {v1, v0}, Lv/Vector;->multiply(I)V
				 /* .line 144 */
			 } // :goto_0
			 v1 = this.m_forces;
			 /* iget v2, p0, Lv/Vphob;->m_gravity:I */
			 (( v.Vector ) v1 ).add ( v3, v2, v3 ); // invoke-virtual {v1, v3, v2, v3}, Lv/Vector;->add(III)V
			 /* .line 151 */
		 } // .end local v0 # "t":I
	 } // :goto_1
	 v1 = this.m_acceleration;
	 v2 = this.m_forces;
	 (( v.Vector ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Lv/Vector;->set(Lv/Vector;)V
	 /* .line 152 */
	 return;
	 /* .line 129 */
	 /* .restart local v0 # "t":I */
} // :cond_0
v1 = this.m_forces;
(( v.Vector ) v1 ).set ( v3, v3, v3 ); // invoke-virtual {v1, v3, v3, v3}, Lv/Vector;->set(III)V
/* .line 130 */
v1 = this.m_velocity;
(( v.Vector ) v1 ).set ( v3, v3, v3 ); // invoke-virtual {v1, v3, v3, v3}, Lv/Vector;->set(III)V
/* .line 147 */
} // .end local v0 # "t":I
} // :cond_1
v1 = this.m_forces;
/* iget v2, p0, Lv/Vphob;->m_gravity:I */
(( v.Vector ) v1 ).set ( v3, v2, v3 ); // invoke-virtual {v1, v3, v2, v3}, Lv/Vector;->set(III)V
} // .end method
public Boolean collision ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 6 */
/* .param p1, "nx" # I */
/* .param p2, "ny" # I */
/* .param p3, "nz" # I */
/* .param p4, "cfr" # I */
/* .param p5, "friction" # I */
/* .prologue */
/* .line 159 */
v3 = this.m_collisionNormal;
(( v.Vector ) v3 ).set ( p1, p2, p3 ); // invoke-virtual {v3, p1, p2, p3}, Lv/Vector;->set(III)V
/* .line 161 */
v3 = this.m_velocity;
v4 = this.m_collisionNormal;
v1 = (( v.Vector ) v3 ).dotProduct ( v4 ); // invoke-virtual {v3, v4}, Lv/Vector;->dotProduct(Lv/Vector;)I
/* .line 163 */
/* .local v1, "vrn":I */
/* if-ltz v1, :cond_0 */
/* .line 164 */
int v3 = 0; // const/4 v3, 0x0
/* .line 214 */
} // :goto_0
/* .line 172 */
} // :cond_0
/* const v3, 0x8000 */
/* add-int/2addr v3, p4 */
v3 = v.Vphob .fmul ( v3,v1 );
/* neg-int v0, v3 */
/* .line 178 */
/* .local v0, "j":I */
v3 = this.m_u;
v4 = this.m_collisionNormal;
(( v.Vector ) v3 ).set ( v4 ); // invoke-virtual {v3, v4}, Lv/Vector;->set(Lv/Vector;)V
/* .line 179 */
v3 = this.m_u;
(( v.Vector ) v3 ).multiply ( v0 ); // invoke-virtual {v3, v0}, Lv/Vector;->multiply(I)V
/* .line 181 */
v3 = this.m_velocity;
v4 = this.m_u;
(( v.Vector ) v3 ).add ( v4 ); // invoke-virtual {v3, v4}, Lv/Vector;->add(Lv/Vector;)V
/* .line 185 */
v3 = this.m_collisionTangent;
v4 = this.m_collisionNormal;
v5 = this.m_velocity;
(( v.Vector ) v3 ).crossProduct ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Lv/Vector;->crossProduct(Lv/Vector;Lv/Vector;)V
/* .line 186 */
v3 = this.m_collisionTangent;
v4 = this.m_collisionTangent;
v5 = this.m_collisionNormal;
(( v.Vector ) v3 ).crossProduct ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Lv/Vector;->crossProduct(Lv/Vector;Lv/Vector;)V
/* .line 187 */
v3 = this.m_collisionTangent;
(( v.Vector ) v3 ).negate ( ); // invoke-virtual {v3}, Lv/Vector;->negate()V
/* .line 188 */
v3 = this.m_collisionTangent;
(( v.Vector ) v3 ).normalize ( ); // invoke-virtual {v3}, Lv/Vector;->normalize()V
/* .line 190 */
v3 = this.m_velocity;
v4 = this.m_collisionTangent;
v2 = (( v.Vector ) v3 ).dotProduct ( v4 ); // invoke-virtual {v3, v4}, Lv/Vector;->dotProduct(Lv/Vector;)I
/* .line 191 */
/* .local v2, "vrt":I */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 192 */
v3 = this.m_v;
v4 = this.m_collisionTangent;
(( v.Vector ) v3 ).set ( v4 ); // invoke-virtual {v3, v4}, Lv/Vector;->set(Lv/Vector;)V
/* .line 193 */
v3 = this.m_v;
v4 = v.Vphob .fmul ( p5,v0 );
(( v.Vector ) v3 ).multiply ( v4 ); // invoke-virtual {v3, v4}, Lv/Vector;->multiply(I)V
/* .line 202 */
v3 = this.m_velocity;
v4 = this.m_v;
(( v.Vector ) v3 ).add ( v4 ); // invoke-virtual {v3, v4}, Lv/Vector;->add(Lv/Vector;)V
/* .line 214 */
} // :cond_1
int v3 = 1; // const/4 v3, 0x1
} // .end method
public Integer collisionCheckEnvironment ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "t" # I */
/* .prologue */
/* .line 220 */
} // .end method
public Integer collisionCheckObject ( v.Vphob p0, Integer p1 ) {
/* .locals 0 */
/* .param p1, "p" # Lv/Vphob; */
/* .param p2, "t" # I */
/* .prologue */
/* .line 225 */
} // .end method
public void collisionResponse ( ) {
/* .locals 0 */
/* .prologue */
/* .line 229 */
return;
} // .end method
public v.Vector getPosition ( ) {
/* .locals 1 */
/* .prologue */
/* .line 249 */
v0 = this.m_position;
} // .end method
public Boolean moved ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 253 */
v1 = this.m_parent;
/* if-nez v1, :cond_0 */
/* move v1, v3 */
/* .line 257 */
} // :goto_0
/* .line 256 */
} // :cond_0
/* iget v1, p0, Lv/Vphob;->m_radius:I */
/* shl-int/lit8 v0, v1, 0x1 */
/* .line 257 */
/* .local v0, "d":I */
/* iget v1, p0, Lv/Vphob;->m_vx1:I */
/* iget v2, p0, Lv/Vphob;->m_vx0:I */
/* sub-int/2addr v1, v2 */
/* sub-int/2addr v1, v0 */
/* if-gtz v1, :cond_1 */
/* iget v1, p0, Lv/Vphob;->m_vz1:I */
/* iget v2, p0, Lv/Vphob;->m_vz0:I */
/* sub-int/2addr v1, v2 */
/* sub-int/2addr v1, v0 */
/* if-gtz v1, :cond_1 */
/* move v1, v3 */
} // :cond_1
int v1 = 1; // const/4 v1, 0x1
} // .end method
public void setPosition ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .param p1, "x" # I */
/* .param p2, "y" # I */
/* .param p3, "z" # I */
/* .prologue */
/* .line 261 */
v0 = this.m_position;
(( v.Vector ) v0 ).set ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Lv/Vector;->set(III)V
/* .line 262 */
return;
} // .end method
public void setVelocity ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .param p1, "x" # I */
/* .param p2, "y" # I */
/* .param p3, "z" # I */
/* .prologue */
/* .line 265 */
v0 = this.m_velocity;
(( v.Vector ) v0 ).set ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Lv/Vector;->set(III)V
/* .line 266 */
return;
} // .end method
void stateRestore ( ) {
/* .locals 3 */
/* .prologue */
/* .line 270 */
v0 = this.m_position;
v1 = this.m_position0;
(( v.Vector ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lv/Vector;->set(Lv/Vector;)V
/* .line 271 */
v0 = this.m_position;
/* iget v0, v0, Lv/Vector;->m_x:I */
v1 = this.m_position;
/* iget v1, v1, Lv/Vector;->m_y:I */
v2 = this.m_position;
/* iget v2, v2, Lv/Vector;->m_z:I */
(( v.Vphob ) p0 ).setWxyz ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lv/Vphob;->setWxyz(III)V
/* .line 272 */
v0 = this.m_velocity;
v1 = this.m_velocity0;
(( v.Vector ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lv/Vector;->set(Lv/Vector;)V
/* .line 273 */
return;
} // .end method
void stateSave ( ) {
/* .locals 4 */
/* .prologue */
/* .line 277 */
v0 = this.m_position;
/* iget v1, p0, Lv/Vphob;->m_wx:I */
/* iget v2, p0, Lv/Vphob;->m_wy:I */
/* iget v3, p0, Lv/Vphob;->m_wz:I */
(( v.Vector ) v0 ).set ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lv/Vector;->set(III)V
/* .line 278 */
v0 = this.m_position0;
v1 = this.m_position;
(( v.Vector ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lv/Vector;->set(Lv/Vector;)V
/* .line 279 */
v0 = this.m_velocity0;
v1 = this.m_velocity;
(( v.Vector ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lv/Vector;->set(Lv/Vector;)V
/* .line 280 */
return;
} // .end method
void step ( Integer p0 ) {
/* .locals 9 */
/* .param p1, "dt" # I */
/* .prologue */
/* .line 284 */
v6 = this.m_velocity;
v7 = this.m_acceleration;
(( v.Vector ) v6 ).mulAdd ( v7, p1 ); // invoke-virtual {v6, v7, p1}, Lv/Vector;->mulAdd(Lv/Vector;I)V
/* .line 285 */
v6 = this.m_position;
v7 = this.m_velocity;
(( v.Vector ) v6 ).mulAdd ( v7, p1 ); // invoke-virtual {v6, v7, p1}, Lv/Vector;->mulAdd(Lv/Vector;I)V
/* .line 287 */
v6 = this.m_position;
/* iget v6, v6, Lv/Vector;->m_x:I */
v7 = this.m_position;
/* iget v7, v7, Lv/Vector;->m_y:I */
v8 = this.m_position;
/* iget v8, v8, Lv/Vector;->m_z:I */
(( v.Vphob ) p0 ).setWxyz ( v6, v7, v8 ); // invoke-virtual {p0, v6, v7, v8}, Lv/Vphob;->setWxyz(III)V
/* .line 291 */
/* iget v2, p0, Lv/Vphob;->m_wx:I */
/* .line 292 */
/* .local v2, "vx0":I */
/* iget v4, p0, Lv/Vphob;->m_wz:I */
/* .line 293 */
/* .local v4, "vz0":I */
v6 = this.m_position0;
/* iget v3, v6, Lv/Vector;->m_x:I */
/* .line 294 */
/* .local v3, "vx1":I */
v6 = this.m_position0;
/* iget v5, v6, Lv/Vector;->m_z:I */
/* .line 296 */
/* .local v5, "vz1":I */
/* if-le v2, v3, :cond_0 */
/* .line 297 */
/* move v1, v2 */
/* .line 298 */
/* .local v1, "t":I */
/* move v2, v3 */
/* .line 299 */
/* move v3, v1 */
/* .line 302 */
} // .end local v1 # "t":I
} // :cond_0
/* if-le v4, v5, :cond_1 */
/* .line 303 */
/* move v1, v4 */
/* .line 304 */
/* .restart local v1 # "t":I */
/* move v4, v5 */
/* .line 305 */
/* move v5, v1 */
/* .line 308 */
} // .end local v1 # "t":I
} // :cond_1
/* iget v0, p0, Lv/Vphob;->m_radius:I */
/* .line 309 */
/* .local v0, "r":I */
/* sub-int v6, v2, v0 */
/* iput v6, p0, Lv/Vphob;->m_vx0:I */
/* .line 310 */
/* add-int v6, v3, v0 */
/* iput v6, p0, Lv/Vphob;->m_vx1:I */
/* .line 311 */
/* sub-int v6, v4, v0 */
/* iput v6, p0, Lv/Vphob;->m_vz0:I */
/* .line 312 */
/* add-int v6, v5, v0 */
/* iput v6, p0, Lv/Vphob;->m_vz1:I */
/* .line 317 */
return;
} // .end method
void stepAngular ( Integer p0 ) {
/* .locals 6 */
/* .param p1, "dt" # I */
/* .prologue */
/* .line 322 */
v2 = this.m_velocity;
/* iget v0, v2, Lv/Vector;->m_x:I */
/* .line 323 */
/* .local v0, "dx":I */
v2 = this.m_velocity;
/* iget v1, v2, Lv/Vector;->m_z:I */
/* .line 324 */
/* .local v1, "dz":I */
/* if-nez v0, :cond_0 */
/* if-nez v1, :cond_0 */
/* .line 340 */
} // :goto_0
return;
/* .line 329 */
} // :cond_0
v2 = this.m_angularVelocity;
/* neg-int v3, v1 */
/* iget v4, p0, Lv/Vphob;->m_inverseCircumference:I */
v3 = v.Vphob .fmul ( v3,v4 );
/* shl-int/lit8 v3, v3, 0x1 */
int v4 = 0; // const/4 v4, 0x0
/* iget v5, p0, Lv/Vphob;->m_inverseCircumference:I */
v5 = v.Vphob .fmul ( v0,v5 );
/* shl-int/lit8 v5, v5, 0x1 */
(( v.Vector ) v2 ).set ( v3, v4, v5 ); // invoke-virtual {v2, v3, v4, v5}, Lv/Vector;->set(III)V
/* .line 332 */
v2 = this.m_qt;
v3 = this.m_qOrientation;
v4 = this.m_angularVelocity;
(( v.Vquaternion ) v2 ).multiply ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lv/Vquaternion;->multiply(Lv/Vquaternion;Lv/Vector;)V
/* .line 334 */
v2 = this.m_qt;
(( v.Vquaternion ) v2 ).multiply ( p1 ); // invoke-virtual {v2, p1}, Lv/Vquaternion;->multiply(I)V
/* .line 336 */
v2 = this.m_qOrientation;
v3 = this.m_qt;
(( v.Vquaternion ) v2 ).add ( v3 ); // invoke-virtual {v2, v3}, Lv/Vquaternion;->add(Lv/Vquaternion;)V
/* .line 337 */
v2 = this.m_qOrientation;
(( v.Vquaternion ) v2 ).normalize ( ); // invoke-virtual {v2}, Lv/Vquaternion;->normalize()V
/* .line 339 */
v2 = this.m_qOrientation;
(( v.Vquaternion ) v2 ).setMatrix ( p0 ); // invoke-virtual {v2, p0}, Lv/Vquaternion;->setMatrix(Lv/Vmat;)V
} // .end method
