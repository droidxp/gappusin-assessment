public class v.Vsprite extends v.Vmat {
	 /* .source "Vsprite.java" */
	 /* # static fields */
	 public static final Integer ZMAX;
	 public static Integer m_inset;
	 /* # instance fields */
	 public v.V3dModel m_3dmodel;
	 public Integer m_alpha;
	 public v.Vsprite m_child;
	 public Integer m_color;
	 Integer m_colorGradient;
	 public Integer m_csum;
	 public Integer m_height;
	 public Integer m_id;
	 public v.Vilib m_lib;
	 public Integer m_libi;
	 public v.Vmat m_mt;
	 public v.Vsprite m_parent;
	 v.Vquaternion m_qOrientation;
	 Integer m_scale;
	 public v.Vsprite m_sibling;
	 Integer m_sscale;
	 public Integer m_sx;
	 public Integer m_sx0;
	 Integer m_sx0f;
	 public Integer m_sx1;
	 public Integer m_sy;
	 public Integer m_sy0;
	 Integer m_sy0f;
	 public Integer m_sy1;
	 public Integer m_sz;
	 public Integer m_width;
	 public Integer m_wx;
	 public Integer m_wy;
	 public Integer m_wz;
	 public Integer m_xcenter;
	 public Integer m_ycenter;
	 /* # direct methods */
	 public v.Vsprite ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* const v1, 0x8000 */
		 /* .line 784 */
		 /* invoke-direct {p0}, Lv/Vmat;-><init>()V */
		 /* .line 785 */
		 (( v.Vsprite ) p0 ).identity ( ); // invoke-virtual {p0}, Lv/Vsprite;->identity()V
		 /* .line 786 */
		 /* iput v1, p0, Lv/Vsprite;->m_alpha:I */
		 /* .line 787 */
		 int v0 = -1; // const/4 v0, -0x1
		 /* iput v0, p0, Lv/Vsprite;->m_libi:I */
		 /* .line 788 */
		 /* iput v1, p0, Lv/Vsprite;->m_scale:I */
		 /* .line 791 */
		 return;
	 } // .end method
	 public v.Vsprite ( ) {
		 /* .locals 2 */
		 /* .param p1, "x" # I */
		 /* .param p2, "y" # I */
		 /* .param p3, "width" # I */
		 /* .param p4, "height" # I */
		 /* .param p5, "color" # I */
		 /* .prologue */
		 /* const v1, 0x8000 */
		 /* .line 793 */
		 /* invoke-direct {p0}, Lv/Vmat;-><init>()V */
		 /* .line 794 */
		 (( v.Vsprite ) p0 ).identity ( ); // invoke-virtual {p0}, Lv/Vsprite;->identity()V
		 /* .line 795 */
		 /* iput v1, p0, Lv/Vsprite;->m_alpha:I */
		 /* .line 796 */
		 int v0 = -1; // const/4 v0, -0x1
		 /* iput v0, p0, Lv/Vsprite;->m_libi:I */
		 /* .line 797 */
		 /* iput v1, p0, Lv/Vsprite;->m_scale:I */
		 /* .line 799 */
		 (( v.Vsprite ) p0 ).setXyi ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lv/Vsprite;->setXyi(II)V
		 /* .line 800 */
		 (( v.Vsprite ) p0 ).setWidthHeight ( p3, p4 ); // invoke-virtual {p0, p3, p4}, Lv/Vsprite;->setWidthHeight(II)V
		 /* .line 801 */
		 (( v.Vsprite ) p0 ).setColor ( p5 ); // invoke-virtual {p0, p5}, Lv/Vsprite;->setColor(I)V
		 /* .line 802 */
		 return;
	 } // .end method
	 public v.Vsprite ( ) {
		 /* .locals 2 */
		 /* .param p1, "m" # Lv/V3dModel; */
		 /* .prologue */
		 /* const v1, 0x8000 */
		 /* .line 813 */
		 /* invoke-direct {p0}, Lv/Vmat;-><init>()V */
		 /* .line 814 */
		 (( v.Vsprite ) p0 ).identity ( ); // invoke-virtual {p0}, Lv/Vsprite;->identity()V
		 /* .line 815 */
		 this.m_3dmodel = p1;
		 /* .line 816 */
		 /* iget v0, p1, Lv/V3dModel;->m_wx:I */
		 /* iput v0, p0, Lv/Vsprite;->m_wx:I */
		 /* .line 817 */
		 /* iget v0, p1, Lv/V3dModel;->m_wy:I */
		 /* iput v0, p0, Lv/Vsprite;->m_wy:I */
		 /* .line 818 */
		 /* iget v0, p1, Lv/V3dModel;->m_wz:I */
		 /* iput v0, p0, Lv/Vsprite;->m_wz:I */
		 /* .line 819 */
		 /* iput v1, p0, Lv/Vsprite;->m_alpha:I */
		 /* .line 820 */
		 /* iput v1, p0, Lv/Vsprite;->m_scale:I */
		 /* .line 823 */
		 return;
	 } // .end method
	 public v.Vsprite ( ) {
		 /* .locals 2 */
		 /* .param p1, "parent" # Lv/Vsprite; */
		 /* .param p2, "lib" # Lv/Vilib; */
		 /* .param p3, "libi" # I */
		 /* .param p4, "x" # I */
		 /* .param p5, "y" # I */
		 /* .prologue */
		 /* const v1, 0x8000 */
		 /* .line 804 */
		 /* invoke-direct {p0}, Lv/Vmat;-><init>()V */
		 /* .line 805 */
		 /* iput v1, p0, Lv/Vsprite;->m_alpha:I */
		 /* .line 806 */
		 int v0 = -1; // const/4 v0, -0x1
		 /* iput v0, p0, Lv/Vsprite;->m_libi:I */
		 /* .line 807 */
		 /* iput v1, p0, Lv/Vsprite;->m_scale:I */
		 /* .line 808 */
		 (( v.Vsprite ) p0 ).setImage ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Lv/Vsprite;->setImage(Lv/Vilib;I)V
		 /* .line 809 */
		 (( v.Vsprite ) p0 ).setXyi ( p4, p5 ); // invoke-virtual {p0, p4, p5}, Lv/Vsprite;->setXyi(II)V
		 /* .line 810 */
		 (( v.Vsprite ) p1 ).add ( p0 ); // invoke-virtual {p1, p0}, Lv/Vsprite;->add(Lv/Vsprite;)V
		 /* .line 811 */
		 return;
	 } // .end method
	 public static v.Vsprite create ( java.lang.String p0 ) {
		 /* .locals 4 */
		 /* .param p0, "classname" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 227 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 229 */
		 /* .local v0, "c":Ljava/lang/Class; */
		 try { // :try_start_0
			 java.lang.Class .forName ( p0 );
			 /* .line 230 */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 232 */
				 (( java.lang.Class ) v0 ).newInstance ( ); // invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
			 } // .end local p0 # "classname":Ljava/lang/String;
			 /* check-cast p0, Lv/Vsprite; */
			 /* move-object v1, p0 */
			 /* .line 240 */
		 } // :goto_0
		 /* .line 235 */
		 /* .restart local p0 # "classname":Ljava/lang/String; */
	 } // :cond_0
	 /* new-instance v1, Ljava/lang/Exception; */
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 final String v3 = "null forName "; // const-string v3, "null forName "
	 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V */
	 /* throw v1 */
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 237 */
} // .end local p0 # "classname":Ljava/lang/String;
/* :catch_0 */
/* move-exception v1 */
/* .line 240 */
int v1 = 0; // const/4 v1, 0x0
} // .end method
private void erase ( ) {
/* .locals 2 */
/* .prologue */
/* .line 407 */
(( v.Vsprite ) p0 ).redraw ( ); // invoke-virtual {p0}, Lv/Vsprite;->redraw()V
/* .line 408 */
/* iget v1, p0, Lv/Vsprite;->m_csum:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, p0, Lv/Vsprite;->m_csum:I */
/* .line 411 */
v0 = this.m_child;
/* .local v0, "p":Lv/Vsprite; */
} // :goto_0
/* if-nez v0, :cond_0 */
/* .line 413 */
return;
/* .line 412 */
} // :cond_0
/* invoke-direct {v0}, Lv/Vsprite;->erase()V */
/* .line 411 */
v0 = this.m_sibling;
} // .end method
/* # virtual methods */
public void add ( v.Vsprite p0 ) {
/* .locals 4 */
/* .param p1, "ps" # Lv/Vsprite; */
/* .prologue */
/* .line 93 */
v3 = this.m_parent;
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 117 */
} // :goto_0
return;
/* .line 99 */
} // :cond_0
/* iget v2, p1, Lv/Vsprite;->m_sz:I */
/* .line 101 */
/* .local v2, "z":I */
int v1 = 0; // const/4 v1, 0x0
/* .line 102 */
/* .local v1, "prev":Lv/Vsprite; */
v0 = this.m_child;
/* .line 104 */
/* .local v0, "p":Lv/Vsprite; */
} // :goto_1
/* if-nez v0, :cond_2 */
/* .line 111 */
} // :cond_1
this.m_sibling = v0;
/* .line 112 */
/* if-nez v1, :cond_3 */
/* .line 113 */
this.m_child = p1;
/* .line 116 */
} // :goto_2
this.m_parent = p0;
/* .line 105 */
} // :cond_2
/* iget v3, v0, Lv/Vsprite;->m_sz:I */
/* if-gt v2, v3, :cond_1 */
/* .line 107 */
/* move-object v1, v0 */
/* .line 108 */
v0 = this.m_sibling;
/* .line 115 */
} // :cond_3
this.m_sibling = p1;
} // .end method
public v.Vtext addBottom ( java.lang.String p0, Integer p1 ) {
/* .locals 1 */
/* .param p1, "text" # Ljava/lang/String; */
/* .param p2, "fieldw" # I */
/* .prologue */
/* .line 126 */
/* new-instance v0, Lv/Vtext; */
/* invoke-direct {v0, p1}, Lv/Vtext;-><init>(Ljava/lang/String;)V */
/* .line 127 */
/* .local v0, "p":Lv/Vtext; */
(( v.Vtext ) v0 ).setFieldWidth ( p2 ); // invoke-virtual {v0, p2}, Lv/Vtext;->setFieldWidth(I)V
/* .line 128 */
(( v.Vsprite ) p0 ).addBottom ( v0 ); // invoke-virtual {p0, v0}, Lv/Vsprite;->addBottom(Lv/Vsprite;)V
/* .line 129 */
} // .end method
public void addBottom ( v.Vsprite p0 ) {
/* .locals 3 */
/* .param p1, "ps" # Lv/Vsprite; */
/* .prologue */
/* .line 134 */
(( v.Vsprite ) p0 ).addTail ( p1 ); // invoke-virtual {p0, p1}, Lv/Vsprite;->addTail(Lv/Vsprite;)V
/* .line 135 */
v1 = (( v.Vsprite ) p1 ).getWidth ( ); // invoke-virtual {p1}, Lv/Vsprite;->getWidth()I
/* shl-int/lit8 v2, v2, 0x1 */
/* add-int v0, v1, v2 */
/* .line 136 */
/* .local v0, "w":I */
/* iget v1, p0, Lv/Vsprite;->m_width:I */
/* if-le v0, v1, :cond_0 */
/* .line 137 */
/* iput v0, p0, Lv/Vsprite;->m_width:I */
/* .line 138 */
} // :cond_0
/* iget v2, p0, Lv/Vsprite;->m_height:I */
(( v.Vsprite ) p1 ).setXyi ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Lv/Vsprite;->setXyi(II)V
/* .line 139 */
/* iget v1, p0, Lv/Vsprite;->m_height:I */
v2 = (( v.Vsprite ) p1 ).getHeight ( ); // invoke-virtual {p1}, Lv/Vsprite;->getHeight()I
/* add-int/2addr v1, v2 */
/* iput v1, p0, Lv/Vsprite;->m_height:I */
/* .line 140 */
return;
} // .end method
public v.Vtext addBs ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "text" # Ljava/lang/String; */
/* .prologue */
/* .line 120 */
/* new-instance v0, Lv/Vtext; */
/* invoke-direct {v0, p1}, Lv/Vtext;-><init>(Ljava/lang/String;)V */
/* .line 121 */
/* .local v0, "p":Lv/Vtext; */
(( v.Vsprite ) p0 ).addBottom ( v0 ); // invoke-virtual {p0, v0}, Lv/Vsprite;->addBottom(Lv/Vsprite;)V
/* .line 122 */
} // .end method
public void addCenter ( v.Vsprite p0 ) {
/* .locals 3 */
/* .param p1, "child" # Lv/Vsprite; */
/* .prologue */
/* .line 146 */
(( v.Vsprite ) p0 ).add ( p1 ); // invoke-virtual {p0, p1}, Lv/Vsprite;->add(Lv/Vsprite;)V
/* .line 147 */
/* iget v0, p0, Lv/Vsprite;->m_width:I */
v1 = (( v.Vsprite ) p1 ).getWidth ( ); // invoke-virtual {p1}, Lv/Vsprite;->getWidth()I
/* sub-int/2addr v0, v1 */
/* shr-int/lit8 v0, v0, 0x1 */
/* iget v1, p0, Lv/Vsprite;->m_height:I */
v2 = (( v.Vsprite ) p1 ).getHeight ( ); // invoke-virtual {p1}, Lv/Vsprite;->getHeight()I
/* sub-int/2addr v1, v2 */
/* shr-int/lit8 v1, v1, 0x1 */
(( v.Vsprite ) p1 ).setXyi ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lv/Vsprite;->setXyi(II)V
/* .line 148 */
return;
} // .end method
public v.Vtext addCenterBottom ( java.lang.String p0, Integer p1 ) {
/* .locals 1 */
/* .param p1, "text" # Ljava/lang/String; */
/* .param p2, "fieldw" # I */
/* .prologue */
/* .line 157 */
/* new-instance v0, Lv/Vtext; */
/* invoke-direct {v0, p1}, Lv/Vtext;-><init>(Ljava/lang/String;)V */
/* .line 158 */
/* .local v0, "p":Lv/Vtext; */
(( v.Vtext ) v0 ).setFieldWidth ( p2 ); // invoke-virtual {v0, p2}, Lv/Vtext;->setFieldWidth(I)V
/* .line 159 */
(( v.Vsprite ) p0 ).addCenterBottom ( v0 ); // invoke-virtual {p0, v0}, Lv/Vsprite;->addCenterBottom(Lv/Vsprite;)V
/* .line 160 */
} // .end method
public void addCenterBottom ( v.Vsprite p0 ) {
/* .locals 2 */
/* .param p1, "child" # Lv/Vsprite; */
/* .prologue */
/* .line 165 */
(( v.Vsprite ) p0 ).addBottom ( p1 ); // invoke-virtual {p0, p1}, Lv/Vsprite;->addBottom(Lv/Vsprite;)V
/* .line 166 */
/* iget v0, p0, Lv/Vsprite;->m_width:I */
v1 = (( v.Vsprite ) p1 ).getWidth ( ); // invoke-virtual {p1}, Lv/Vsprite;->getWidth()I
/* sub-int/2addr v0, v1 */
/* shl-int/lit8 v0, v0, 0xe */
v1 = (( v.Vsprite ) p1 ).getY ( ); // invoke-virtual {p1}, Lv/Vsprite;->getY()I
(( v.Vsprite ) p1 ).setXy ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lv/Vsprite;->setXy(II)V
/* .line 167 */
return;
} // .end method
public v.Vtext addCenterBs ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "text" # Ljava/lang/String; */
/* .prologue */
/* .line 151 */
/* new-instance v0, Lv/Vtext; */
/* invoke-direct {v0, p1}, Lv/Vtext;-><init>(Ljava/lang/String;)V */
/* .line 152 */
/* .local v0, "p":Lv/Vtext; */
(( v.Vsprite ) p0 ).addCenterBottom ( v0 ); // invoke-virtual {p0, v0}, Lv/Vsprite;->addCenterBottom(Lv/Vsprite;)V
/* .line 153 */
} // .end method
public void addRight ( v.Vsprite p0, Integer p1 ) {
/* .locals 3 */
/* .param p1, "ps" # Lv/Vsprite; */
/* .param p2, "spacer" # I */
/* .prologue */
/* .line 171 */
(( v.Vsprite ) p0 ).addTail ( p1 ); // invoke-virtual {p0, p1}, Lv/Vsprite;->addTail(Lv/Vsprite;)V
/* .line 172 */
/* iget v1, p0, Lv/Vsprite;->m_width:I */
/* add-int/2addr v1, p2 */
int v2 = 0; // const/4 v2, 0x0
(( v.Vsprite ) p1 ).setXyi ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Lv/Vsprite;->setXyi(II)V
/* .line 173 */
/* iget v1, p0, Lv/Vsprite;->m_width:I */
v2 = (( v.Vsprite ) p1 ).getWidth ( ); // invoke-virtual {p1}, Lv/Vsprite;->getWidth()I
/* add-int/2addr v2, p2 */
/* add-int/2addr v2, p2 */
/* add-int/2addr v1, v2 */
/* iput v1, p0, Lv/Vsprite;->m_width:I */
/* .line 174 */
v0 = (( v.Vsprite ) p1 ).getHeight ( ); // invoke-virtual {p1}, Lv/Vsprite;->getHeight()I
/* .line 175 */
/* .local v0, "h":I */
/* iget v1, p0, Lv/Vsprite;->m_height:I */
/* if-le v0, v1, :cond_0 */
/* .line 176 */
/* iput v0, p0, Lv/Vsprite;->m_height:I */
/* .line 177 */
} // :cond_0
return;
} // .end method
public void addTail ( v.Vsprite p0 ) {
/* .locals 2 */
/* .param p1, "ps" # Lv/Vsprite; */
/* .prologue */
/* .line 181 */
v0 = this.m_child;
/* .line 182 */
/* .local v0, "p":Lv/Vsprite; */
} // :goto_0
/* if-nez v0, :cond_1 */
/* .line 188 */
} // :cond_0
/* if-nez v0, :cond_2 */
/* .line 189 */
this.m_child = p1;
/* .line 193 */
} // :goto_1
this.m_parent = p0;
/* .line 194 */
return;
/* .line 183 */
} // :cond_1
v1 = this.m_sibling;
/* .line 184 */
/* .local v1, "pnext":Lv/Vsprite; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 186 */
/* move-object v0, v1 */
/* .line 191 */
} // .end local v1 # "pnext":Lv/Vsprite;
} // :cond_2
this.m_sibling = p1;
} // .end method
public void addWxyz ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 3 */
/* .param p1, "dx" # I */
/* .param p2, "dy" # I */
/* .param p3, "dz" # I */
/* .prologue */
/* .line 197 */
/* iget v0, p0, Lv/Vsprite;->m_wx:I */
/* add-int/2addr v0, p1 */
/* iget v1, p0, Lv/Vsprite;->m_wy:I */
/* add-int/2addr v1, p2 */
/* iget v2, p0, Lv/Vsprite;->m_wz:I */
/* add-int/2addr v2, p3 */
(( v.Vsprite ) p0 ).setWxyz ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lv/Vsprite;->setWxyz(III)V
/* .line 198 */
return;
} // .end method
public void addXy ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .param p1, "dx" # I */
/* .param p2, "dy" # I */
/* .prologue */
/* .line 201 */
/* iget v0, p0, Lv/Vsprite;->m_sx:I */
/* add-int/2addr v0, p1 */
/* iput v0, p0, Lv/Vsprite;->m_sx:I */
/* .line 202 */
/* iget v0, p0, Lv/Vsprite;->m_sy:I */
/* add-int/2addr v0, p2 */
/* iput v0, p0, Lv/Vsprite;->m_sy:I */
/* .line 203 */
return;
} // .end method
public void center ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 5 */
/* .param p1, "x0" # I */
/* .param p2, "y0" # I */
/* .param p3, "x1" # I */
/* .param p4, "y1" # I */
/* .prologue */
/* .line 207 */
/* sub-int v3, p3, p1 */
/* iget v4, p0, Lv/Vsprite;->m_width:I */
/* sub-int/2addr v3, v4 */
/* shr-int/lit8 v3, v3, 0x1 */
/* add-int v0, p1, v3 */
/* .line 208 */
/* .local v0, "x":I */
/* sub-int v3, p4, p2 */
/* iget v4, p0, Lv/Vsprite;->m_height:I */
/* sub-int/2addr v3, v4 */
/* shr-int/lit8 v3, v3, 0x1 */
/* add-int v1, p2, v3 */
/* .line 211 */
/* .local v1, "y":I */
/* iget v3, p0, Lv/Vsprite;->m_height:I */
/* add-int v2, v1, v3 */
/* .line 212 */
/* .local v2, "yb":I */
/* if-le v2, p4, :cond_0 */
/* .line 213 */
/* iget v3, p0, Lv/Vsprite;->m_height:I */
/* sub-int v1, p4, v3 */
/* .line 215 */
} // :cond_0
(( v.Vsprite ) p0 ).setXyi ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lv/Vsprite;->setXyi(II)V
/* .line 216 */
return;
} // .end method
protected Integer checksum ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* .param p1, "x" # I */
/* .param p2, "y" # I */
/* .param p3, "scale" # I */
/* .prologue */
/* .line 219 */
/* shl-int/lit8 v0, p2, 0xa */
/* add-int/2addr v0, p1 */
/* add-int/2addr v0, p3 */
/* iget v1, p0, Lv/Vsprite;->m_width:I */
/* add-int/2addr v0, v1 */
/* iget v1, p0, Lv/Vsprite;->m_height:I */
/* shl-int/lit8 v1, v1, 0xa */
/* add-int/2addr v0, v1 */
/* iget v1, p0, Lv/Vsprite;->m_libi:I */
/* shl-int/lit8 v1, v1, 0x7 */
/* add-int/2addr v0, v1 */
/* iget v1, p0, Lv/Vsprite;->m_color:I */
/* add-int/2addr v0, v1 */
/* iget v1, p0, Lv/Vsprite;->m_alpha:I */
/* add-int/2addr v0, v1 */
} // .end method
protected void draw ( Integer[] p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6 ) {
/* .locals 20 */
/* .param p1, "rgb" # [I */
/* .param p2, "width" # I */
/* .param p3, "height" # I */
/* .param p4, "x0" # I */
/* .param p5, "y0" # I */
/* .param p6, "x1" # I */
/* .param p7, "y1" # I */
/* .prologue */
/* .line 254 */
/* move-object/from16 v0, p0 */
v0 = this.m_3dmodel;
/* move-object v3, v0 */
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 257 */
/* move-object/from16 v0, p0 */
v0 = this.m_parent;
/* move-object v2, v0 */
/* .line 267 */
/* .local v2, "p":Lv/Vsprite; */
} // :goto_0
/* iget v3, v2, Lv/Vsprite;->m_width:I */
if ( v3 != null) { // if-eqz v3, :cond_2
v3 = this.m_3dmodel;
/* if-nez v3, :cond_2 */
/* move-object/from16 v3, p0 */
/* move/from16 v4, p4 */
/* move/from16 v5, p5 */
/* move/from16 v6, p6 */
/* move/from16 v7, p7 */
/* .line 270 */
/* invoke-virtual/range {v2 ..v7}, Lv/Vsprite;->drawModel(Lv/Vsprite;IIII)V */
/* .line 287 */
} // .end local v2 # "p":Lv/Vsprite;
} // :cond_0
} // :goto_1
/* move-object/from16 v0, p0 */
v0 = this.m_child;
/* move-object v3, v0 */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 288 */
/* invoke-virtual/range {p0 ..p7}, Lv/Vsprite;->drawChildren([IIIIIII)V */
/* .line 289 */
} // :cond_1
return;
/* .line 268 */
/* .restart local v2 # "p":Lv/Vsprite; */
} // :cond_2
v2 = this.m_parent;
/* .line 272 */
} // .end local v2 # "p":Lv/Vsprite;
} // :cond_3
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vsprite;->m_libi:I */
/* move v3, v0 */
int v4 = -1; // const/4 v4, -0x1
/* if-eq v3, v4, :cond_4 */
/* .line 273 */
/* move-object/from16 v0, p0 */
v0 = this.m_lib;
/* move-object v3, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vsprite;->m_libi:I */
/* move v4, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vsprite;->m_sx0f:I */
/* move v12, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vsprite;->m_sy0f:I */
/* move v13, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vsprite;->m_sscale:I */
/* move v14, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vsprite;->m_sz:I */
/* move v5, v0 */
/* shr-int/lit8 v15, v5, 0xf */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vsprite;->m_alpha:I */
/* move/from16 v16, v0 */
/* move-object/from16 v5, p1 */
/* move/from16 v6, p2 */
/* move/from16 v7, p3 */
/* move/from16 v8, p4 */
/* move/from16 v9, p5 */
/* move/from16 v10, p6 */
/* move/from16 v11, p7 */
/* invoke-virtual/range {v3 ..v16}, Lv/Vilib;->drawPicture(I[IIIIIIIIIIII)I */
/* .line 275 */
} // :cond_4
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vsprite;->m_colorGradient:I */
/* move v3, v0 */
if ( v3 != null) { // if-eqz v3, :cond_5
/* .line 277 */
/* const v3, 0x8000 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vsprite;->m_height:I */
/* move v4, v0 */
/* div-int v19, v3, v4 */
/* .line 278 */
/* .local v19, "scale":I */
/* move/from16 v8, p5 */
/* .local v8, "y":I */
} // :goto_2
/* move v0, v8 */
/* move/from16 v1, p7 */
/* if-ge v0, v1, :cond_0 */
/* .line 279 */
/* add-int/lit8 v10, v8, 0x1 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vsprite;->m_color:I */
/* move v3, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vsprite;->m_colorGradient:I */
/* move v4, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vsprite;->m_sy0:I */
/* move v5, v0 */
/* sub-int v5, v8, v5 */
/* mul-int v5, v5, v19 */
v11 = v.Vsprite .bilurpRgb ( v3,v4,v5 );
/* const/16 v12, 0xff */
/* move-object/from16 v3, p0 */
/* move-object/from16 v4, p1 */
/* move/from16 v5, p2 */
/* move/from16 v6, p3 */
/* move/from16 v7, p4 */
/* move/from16 v9, p6 */
/* invoke-virtual/range {v3 ..v12}, Lv/Vsprite;->drawRect([IIIIIIIII)V */
/* .line 278 */
/* add-int/lit8 v8, v8, 0x1 */
/* .line 284 */
} // .end local v8 # "y":I
} // .end local v19 # "scale":I
} // :cond_5
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vsprite;->m_color:I */
/* move/from16 v17, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vsprite;->m_color:I */
/* move v3, v0 */
/* shr-int/lit8 v18, v3, 0x18 */
/* move-object/from16 v9, p0 */
/* move-object/from16 v10, p1 */
/* move/from16 v11, p2 */
/* move/from16 v12, p3 */
/* move/from16 v13, p4 */
/* move/from16 v14, p5 */
/* move/from16 v15, p6 */
/* move/from16 v16, p7 */
/* invoke-virtual/range {v9 ..v18}, Lv/Vsprite;->drawRect([IIIIIIIII)V */
/* goto/16 :goto_1 */
} // .end method
protected void drawChildren ( Integer[] p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6 ) {
/* .locals 18 */
/* .param p1, "rgb" # [I */
/* .param p2, "width" # I */
/* .param p3, "height" # I */
/* .param p4, "x0" # I */
/* .param p5, "y0" # I */
/* .param p6, "x1" # I */
/* .param p7, "y1" # I */
/* .prologue */
/* .line 298 */
/* move-object/from16 v0, p0 */
v0 = this.m_child;
/* move-object v2, v0 */
/* .local v2, "p":Lv/Vsprite; */
} // :goto_0
/* if-nez v2, :cond_0 */
/* .line 345 */
return;
/* .line 301 */
} // :cond_0
/* iget v3, v2, Lv/Vsprite;->m_width:I */
/* if-nez v3, :cond_2 */
/* move-object/from16 v3, p1 */
/* move/from16 v4, p2 */
/* move/from16 v5, p3 */
/* move/from16 v6, p4 */
/* move/from16 v7, p5 */
/* move/from16 v8, p6 */
/* move/from16 v9, p7 */
/* .line 303 */
/* invoke-virtual/range {v2 ..v9}, Lv/Vsprite;->drawChildren([IIIIIII)V */
/* .line 298 */
} // :cond_1
} // :goto_1
v2 = this.m_sibling;
/* .line 307 */
} // :cond_2
/* iget v6, v2, Lv/Vsprite;->m_sx0:I */
/* .line 308 */
/* .local v6, "x00":I */
/* iget v7, v2, Lv/Vsprite;->m_sy0:I */
/* .line 309 */
/* .local v7, "y00":I */
/* iget v8, v2, Lv/Vsprite;->m_sx1:I */
/* .line 310 */
/* .local v8, "x01":I */
/* iget v9, v2, Lv/Vsprite;->m_sy1:I */
/* .line 313 */
/* .local v9, "y01":I */
/* move v0, v6 */
/* move/from16 v1, p4 */
/* if-ge v0, v1, :cond_3 */
/* .line 314 */
/* move/from16 v6, p4 */
/* .line 315 */
} // :cond_3
/* move v0, v7 */
/* move/from16 v1, p5 */
/* if-ge v0, v1, :cond_4 */
/* .line 316 */
/* move/from16 v7, p5 */
/* .line 317 */
} // :cond_4
/* move v0, v8 */
/* move/from16 v1, p6 */
/* if-le v0, v1, :cond_5 */
/* .line 318 */
/* move/from16 v8, p6 */
/* .line 319 */
} // :cond_5
/* move v0, v9 */
/* move/from16 v1, p7 */
/* if-le v0, v1, :cond_6 */
/* .line 320 */
/* move/from16 v9, p7 */
/* .line 322 */
} // :cond_6
/* if-ge v6, v8, :cond_1 */
/* if-ge v7, v9, :cond_1 */
/* .line 326 */
v3 = this.m_3dmodel;
/* if-nez v3, :cond_7 */
/* move-object/from16 v3, p1 */
/* move/from16 v4, p2 */
/* move/from16 v5, p3 */
/* .line 327 */
/* invoke-virtual/range {v2 ..v9}, Lv/Vsprite;->draw([IIIIIII)V */
} // :cond_7
/* move-object v10, v2 */
/* move-object/from16 v11, p1 */
/* move/from16 v12, p2 */
/* move/from16 v13, p3 */
/* move/from16 v14, p4 */
/* move/from16 v15, p5 */
/* move/from16 v16, p6 */
/* move/from16 v17, p7 */
/* .line 329 */
/* invoke-virtual/range {v10 ..v17}, Lv/Vsprite;->draw([IIIIIII)V */
} // .end method
void drawModel ( v.Vsprite p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 0 */
/* .param p1, "ps" # Lv/Vsprite; */
/* .param p2, "clipx0" # I */
/* .param p3, "clipy0" # I */
/* .param p4, "clipx1" # I */
/* .param p5, "clipy1" # I */
/* .prologue */
/* .line 349 */
return;
} // .end method
void drawRect ( Integer[] p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6, Integer p7, Integer p8 ) {
/* .locals 12 */
/* .param p1, "rgb" # [I */
/* .param p2, "width" # I */
/* .param p3, "height" # I */
/* .param p4, "x0" # I */
/* .param p5, "y0" # I */
/* .param p6, "x1" # I */
/* .param p7, "y1" # I */
/* .param p8, "co" # I */
/* .param p9, "alpha" # I */
/* .prologue */
/* .line 355 */
/* move/from16 v0, p9 */
/* and-int/lit16 v0, v0, 0xff */
/* move/from16 p9, v0 */
/* .line 356 */
/* if-nez p9, :cond_1 */
/* .line 403 */
} // :cond_0
return;
/* .line 359 */
} // :cond_1
/* mul-int v9, p5, p2 */
/* add-int v3, v9, p4 */
/* .line 360 */
/* .local v3, "i":I */
/* sub-int v6, p6, p4 */
/* .line 362 */
/* .local v6, "w":I */
/* const/16 v9, 0xff */
/* move/from16 v0, p9 */
/* move v1, v9 */
/* if-ne v0, v1, :cond_3 */
/* .line 363 */
int v7 = 0; // const/4 v7, 0x0
/* .local v7, "x":I */
} // :goto_0
/* if-lt v7, v6, :cond_2 */
/* .line 366 */
/* move v4, v3 */
/* .line 367 */
/* .local v4, "j":I */
/* add-int/lit8 v8, p5, 0x1 */
/* .local v8, "y":I */
} // :goto_1
/* move v0, v8 */
/* move/from16 v1, p7 */
/* if-ge v0, v1, :cond_0 */
/* .line 368 */
/* add-int/2addr v4, p2 */
/* .line 369 */
java.lang.System .arraycopy ( p1,v3,p1,v4,v6 );
/* .line 367 */
/* add-int/lit8 v8, v8, 0x1 */
/* .line 364 */
} // .end local v4 # "j":I
} // .end local v8 # "y":I
} // :cond_2
/* add-int v9, v3, v7 */
/* aput p8, p1, v9 */
/* .line 363 */
/* add-int/lit8 v7, v7, 0x1 */
/* .line 372 */
} // .end local v7 # "x":I
} // :cond_3
/* const/16 v9, 0x80 */
/* move/from16 v0, p9 */
/* move v1, v9 */
/* if-ne v0, v1, :cond_5 */
/* .line 374 */
/* shr-int/lit8 v9, p8, 0x1 */
/* const v10, 0x7f7f7f */
/* and-int p8, v9, v10 */
/* .line 375 */
/* move/from16 v8, p5 */
/* .restart local v8 # "y":I */
} // :goto_2
/* move v0, v8 */
/* move/from16 v1, p7 */
/* if-ge v0, v1, :cond_0 */
/* .line 376 */
int v7 = 0; // const/4 v7, 0x0
/* .restart local v7 # "x":I */
} // :goto_3
/* if-lt v7, v6, :cond_4 */
/* .line 380 */
/* add-int/2addr v3, p2 */
/* .line 375 */
/* add-int/lit8 v8, v8, 0x1 */
/* .line 377 */
} // :cond_4
/* add-int v5, v3, v7 */
/* .line 378 */
/* .local v5, "si":I */
/* aget v9, p1, v5 */
/* shr-int/lit8 v9, v9, 0x1 */
/* const v10, 0x7f7f7f */
/* and-int/2addr v9, v10 */
/* add-int v9, v9, p8 */
/* aput v9, p1, v5 */
/* .line 376 */
/* add-int/lit8 v7, v7, 0x1 */
/* .line 385 */
} // .end local v5 # "si":I
} // .end local v7 # "x":I
} // .end local v8 # "y":I
} // :cond_5
/* shr-int/lit8 v9, p8, 0x10 */
/* and-int/lit16 v9, v9, 0xff */
/* mul-int v9, v9, p9 */
/* const v10, 0xff00 */
/* and-int/2addr v9, v10 */
/* shl-int/lit8 v9, v9, 0x8 */
/* .line 386 */
/* shr-int/lit8 v10, p8, 0x8 */
/* and-int/lit16 v10, v10, 0xff */
/* mul-int v10, v10, p9 */
/* const v11, 0xff00 */
/* and-int/2addr v10, v11 */
/* .line 385 */
/* or-int/2addr v9, v10 */
/* .line 387 */
/* move/from16 v0, p8 */
/* and-int/lit16 v0, v0, 0xff */
/* move v10, v0 */
/* mul-int v10, v10, p9 */
/* const v11, 0xff00 */
/* and-int/2addr v10, v11 */
/* shr-int/lit8 v10, v10, 0x8 */
/* .line 385 */
/* or-int p8, v9, v10 */
/* .line 389 */
/* const/16 v9, 0xff */
/* sub-int p9, v9, p9 */
/* .line 391 */
/* move/from16 v8, p5 */
/* .restart local v8 # "y":I */
} // :goto_4
/* move v0, v8 */
/* move/from16 v1, p7 */
/* if-ge v0, v1, :cond_0 */
/* .line 392 */
int v7 = 0; // const/4 v7, 0x0
/* .restart local v7 # "x":I */
} // :goto_5
/* if-lt v7, v6, :cond_6 */
/* .line 400 */
/* add-int/2addr v3, p2 */
/* .line 391 */
/* add-int/lit8 v8, v8, 0x1 */
/* .line 393 */
} // :cond_6
/* add-int v5, v3, v7 */
/* .line 394 */
/* .restart local v5 # "si":I */
/* aget v2, p1, v5 */
/* .line 395 */
/* .local v2, "co1":I */
/* shr-int/lit8 v9, v2, 0x10 */
/* and-int/lit16 v9, v9, 0xff */
/* mul-int v9, v9, p9 */
/* const v10, 0xff00 */
/* and-int/2addr v9, v10 */
/* shl-int/lit8 v9, v9, 0x8 */
/* .line 396 */
/* shr-int/lit8 v10, v2, 0x8 */
/* and-int/lit16 v10, v10, 0xff */
/* mul-int v10, v10, p9 */
/* const v11, 0xff00 */
/* and-int/2addr v10, v11 */
/* .line 395 */
/* or-int/2addr v9, v10 */
/* .line 397 */
/* and-int/lit16 v10, v2, 0xff */
/* mul-int v10, v10, p9 */
/* const v11, 0xff00 */
/* and-int/2addr v10, v11 */
/* shr-int/lit8 v10, v10, 0x8 */
/* .line 395 */
/* or-int v2, v9, v10 */
/* .line 398 */
/* add-int v9, p8, v2 */
/* aput v9, p1, v5 */
/* .line 392 */
/* add-int/lit8 v7, v7, 0x1 */
} // .end method
public Integer getAlpha ( ) {
/* .locals 1 */
/* .prologue */
/* .line 416 */
/* iget v0, p0, Lv/Vsprite;->m_alpha:I */
} // .end method
public v.Vsprite getChild ( ) {
/* .locals 1 */
/* .prologue */
/* .line 420 */
v0 = this.m_child;
} // .end method
public Integer getHeight ( ) {
/* .locals 1 */
/* .prologue */
/* .line 424 */
/* iget v0, p0, Lv/Vsprite;->m_height:I */
} // .end method
public Integer getId ( ) {
/* .locals 1 */
/* .prologue */
/* .line 428 */
/* iget v0, p0, Lv/Vsprite;->m_id:I */
} // .end method
public Integer getImage ( ) {
/* .locals 1 */
/* .prologue */
/* .line 432 */
/* iget v0, p0, Lv/Vsprite;->m_libi:I */
} // .end method
public v.Vsprite getParent ( ) {
/* .locals 1 */
/* .prologue */
/* .line 436 */
v0 = this.m_parent;
} // .end method
public Integer getScale ( ) {
/* .locals 1 */
/* .prologue */
/* .line 440 */
/* iget v0, p0, Lv/Vsprite;->m_scale:I */
} // .end method
public Integer getWidth ( ) {
/* .locals 1 */
/* .prologue */
/* .line 444 */
/* iget v0, p0, Lv/Vsprite;->m_width:I */
} // .end method
public Integer getWx ( ) {
/* .locals 1 */
/* .prologue */
/* .line 448 */
/* iget v0, p0, Lv/Vsprite;->m_wx:I */
} // .end method
public Integer getWy ( ) {
/* .locals 1 */
/* .prologue */
/* .line 452 */
/* iget v0, p0, Lv/Vsprite;->m_wy:I */
} // .end method
public Integer getWz ( ) {
/* .locals 1 */
/* .prologue */
/* .line 456 */
/* iget v0, p0, Lv/Vsprite;->m_wz:I */
} // .end method
public Integer getX ( ) {
/* .locals 1 */
/* .prologue */
/* .line 460 */
/* iget v0, p0, Lv/Vsprite;->m_sx:I */
} // .end method
public Integer getY ( ) {
/* .locals 1 */
/* .prologue */
/* .line 464 */
/* iget v0, p0, Lv/Vsprite;->m_sy:I */
} // .end method
public Boolean isLinked ( ) {
/* .locals 1 */
/* .prologue */
/* .line 469 */
v0 = this.m_parent;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void off ( ) {
/* .locals 1 */
/* .prologue */
/* .line 474 */
v0 = this.m_parent;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 475 */
v0 = this.m_parent;
(( v.Vsprite ) v0 ).remove ( p0 ); // invoke-virtual {v0, p0}, Lv/Vsprite;->remove(Lv/Vsprite;)V
/* .line 476 */
} // :cond_0
return;
} // .end method
public Boolean pick ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .param p1, "x" # I */
/* .param p2, "y" # I */
/* .prologue */
/* .line 479 */
int v0 = 0; // const/4 v0, 0x0
v0 = (( v.Vsprite ) p0 ).pick ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Lv/Vsprite;->pick(III)Z
} // .end method
public Boolean pick ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 4 */
/* .param p1, "x" # I */
/* .param p2, "y" # I */
/* .param p3, "xtra" # I */
/* .prologue */
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 485 */
/* iget v1, p0, Lv/Vsprite;->m_width:I */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 486 */
/* iget v1, p0, Lv/Vsprite;->m_sx0:I */
/* sub-int/2addr v1, p3 */
/* if-gt v1, p1, :cond_0 */
/* iget v1, p0, Lv/Vsprite;->m_sx1:I */
/* add-int/2addr v1, p3 */
/* if-ge p1, v1, :cond_0 */
/* iget v1, p0, Lv/Vsprite;->m_sy0:I */
/* sub-int/2addr v1, p3 */
/* if-gt v1, p2, :cond_0 */
/* iget v1, p0, Lv/Vsprite;->m_sy1:I */
/* add-int/2addr v1, p3 */
/* if-ge p2, v1, :cond_0 */
/* move v1, v3 */
/* .line 496 */
} // :goto_0
} // :cond_0
/* move v1, v2 */
/* .line 486 */
/* .line 492 */
} // :cond_1
v0 = this.m_child;
/* .local v0, "p":Lv/Vsprite; */
} // :goto_1
/* if-nez v0, :cond_2 */
/* move v1, v2 */
/* .line 496 */
/* .line 493 */
} // :cond_2
v1 = (( v.Vsprite ) v0 ).pick ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Lv/Vsprite;->pick(III)Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* move v1, v3 */
/* .line 494 */
/* .line 492 */
} // :cond_3
v0 = this.m_sibling;
} // .end method
public void redraw ( ) {
/* .locals 4 */
/* .prologue */
/* .line 501 */
/* iget v0, p0, Lv/Vsprite;->m_sx0:I */
/* iget v1, p0, Lv/Vsprite;->m_sy0:I */
/* iget v2, p0, Lv/Vsprite;->m_sx1:I */
/* iget v3, p0, Lv/Vsprite;->m_sy1:I */
(( v.Vsprite ) p0 ).redraw ( v0, v1, v2, v3 ); // invoke-virtual {p0, v0, v1, v2, v3}, Lv/Vsprite;->redraw(IIII)V
/* .line 502 */
return;
} // .end method
void redraw ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .param p1, "x0" # I */
/* .param p2, "y0" # I */
/* .param p3, "x1" # I */
/* .param p4, "y1" # I */
/* .prologue */
/* .line 506 */
v0 = this.m_parent;
if ( v0 != null) { // if-eqz v0, :cond_0
/* if-le p3, p1, :cond_0 */
/* .line 508 */
v0 = this.m_parent;
(( v.Vsprite ) v0 ).redraw ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Lv/Vsprite;->redraw(IIII)V
/* .line 510 */
} // :cond_0
return;
} // .end method
public void releaseImage ( ) {
/* .locals 3 */
/* .prologue */
/* .line 515 */
v1 = this.m_lib;
/* iget v2, p0, Lv/Vsprite;->m_libi:I */
(( v.Vilib ) v1 ).loadPicture ( v2 ); // invoke-virtual {v1, v2}, Lv/Vilib;->loadPicture(I)Lv/Vpicture;
/* .line 516 */
/* .local v0, "pic":Lv/Vpicture; */
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, v0, Lv/Vpicture;->m_used:Z */
/* .line 517 */
v1 = this.m_lib;
/* iget v2, p0, Lv/Vsprite;->m_libi:I */
/* iput v2, v1, Lv/Vilib;->m_lru:I */
/* .line 518 */
return;
} // .end method
public void remove ( v.Vsprite p0 ) {
/* .locals 4 */
/* .param p1, "ps" # Lv/Vsprite; */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 524 */
if ( p1 != null) { // if-eqz p1, :cond_0
v2 = (( v.Vsprite ) p1 ).isLinked ( ); // invoke-virtual {p1}, Lv/Vsprite;->isLinked()Z
/* if-nez v2, :cond_1 */
/* .line 550 */
} // :cond_0
} // :goto_0
return;
/* .line 528 */
} // :cond_1
/* invoke-direct {p1}, Lv/Vsprite;->erase()V */
/* .line 531 */
int v1 = 0; // const/4 v1, 0x0
/* .line 532 */
/* .local v1, "prev":Lv/Vsprite; */
v0 = this.m_child;
/* .line 533 */
/* .local v0, "p":Lv/Vsprite; */
} // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 534 */
/* if-ne v0, p1, :cond_3 */
/* .line 535 */
v0 = this.m_sibling;
/* .line 536 */
/* if-nez v1, :cond_2 */
/* .line 537 */
this.m_child = v0;
/* .line 541 */
} // :goto_2
this.m_parent = v3;
/* .line 542 */
this.m_sibling = v3;
/* .line 539 */
} // :cond_2
this.m_sibling = v0;
/* .line 545 */
} // :cond_3
/* move-object v1, v0 */
/* .line 546 */
v0 = this.m_sibling;
} // .end method
public void removeAll ( ) {
/* .locals 1 */
/* .prologue */
/* .line 553 */
} // :goto_0
v0 = this.m_child;
/* if-nez v0, :cond_0 */
/* .line 555 */
return;
/* .line 554 */
} // :cond_0
v0 = this.m_child;
(( v.Vsprite ) p0 ).remove ( v0 ); // invoke-virtual {p0, v0}, Lv/Vsprite;->remove(Lv/Vsprite;)V
} // .end method
public void removeAllStar ( ) {
/* .locals 1 */
/* .prologue */
/* .line 560 */
} // :goto_0
v0 = this.m_child;
/* .line 561 */
/* .local v0, "p":Lv/Vsprite; */
/* if-nez v0, :cond_0 */
/* .line 566 */
return;
/* .line 563 */
} // :cond_0
(( v.Vsprite ) p0 ).remove ( v0 ); // invoke-virtual {p0, v0}, Lv/Vsprite;->remove(Lv/Vsprite;)V
/* .line 564 */
(( v.Vsprite ) v0 ).removeAllStar ( ); // invoke-virtual {v0}, Lv/Vsprite;->removeAllStar()V
} // .end method
public void render ( ) {
/* .locals 1 */
/* .prologue */
/* .line 569 */
v0 = this.m_parent;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 570 */
v0 = this.m_parent;
(( v.Vsprite ) v0 ).render ( ); // invoke-virtual {v0}, Lv/Vsprite;->render()V
/* .line 571 */
} // :cond_0
return;
} // .end method
void renderChangeDetect ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 3 */
/* .param p1, "x" # I */
/* .param p2, "y" # I */
/* .param p3, "scale" # I */
/* .prologue */
/* .line 576 */
/* const v2, 0x8000 */
/* if-ne p3, v2, :cond_1 */
/* .line 577 */
/* iget v2, p0, Lv/Vsprite;->m_sx:I */
/* add-int/2addr p1, v2 */
/* .line 578 */
/* iget v2, p0, Lv/Vsprite;->m_sy:I */
/* add-int/2addr p2, v2 */
/* .line 579 */
/* iget p3, p0, Lv/Vsprite;->m_scale:I */
/* .line 587 */
} // :goto_0
/* iget v2, p0, Lv/Vsprite;->m_width:I */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 588 */
v0 = (( v.Vsprite ) p0 ).checksum ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lv/Vsprite;->checksum(III)I
/* .line 590 */
/* .local v0, "csum":I */
/* iget v2, p0, Lv/Vsprite;->m_csum:I */
/* if-eq v0, v2, :cond_0 */
/* .line 592 */
/* iput v0, p0, Lv/Vsprite;->m_csum:I */
/* .line 595 */
(( v.Vsprite ) p0 ).redraw ( ); // invoke-virtual {p0}, Lv/Vsprite;->redraw()V
/* .line 598 */
(( v.Vsprite ) p0 ).rescale ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lv/Vsprite;->rescale(III)V
/* .line 601 */
(( v.Vsprite ) p0 ).redraw ( ); // invoke-virtual {p0}, Lv/Vsprite;->redraw()V
/* .line 606 */
} // .end local v0 # "csum":I
} // :cond_0
v1 = this.m_child;
/* .line 607 */
/* .local v1, "ps":Lv/Vsprite; */
} // :goto_1
/* if-nez v1, :cond_2 */
/* .line 611 */
return;
/* .line 582 */
} // .end local v1 # "ps":Lv/Vsprite;
} // :cond_1
/* iget v2, p0, Lv/Vsprite;->m_sx:I */
v2 = v.Vsprite .fmul ( v2,p3 );
/* add-int/2addr p1, v2 */
/* .line 583 */
/* iget v2, p0, Lv/Vsprite;->m_sy:I */
v2 = v.Vsprite .fmul ( v2,p3 );
/* add-int/2addr p2, v2 */
/* .line 584 */
/* iget v2, p0, Lv/Vsprite;->m_scale:I */
p3 = v.Vsprite .fmul ( p3,v2 );
/* .line 608 */
/* .restart local v1 # "ps":Lv/Vsprite; */
} // :cond_2
(( v.Vsprite ) v1 ).renderChangeDetect ( p1, p2, p3 ); // invoke-virtual {v1, p1, p2, p3}, Lv/Vsprite;->renderChangeDetect(III)V
/* .line 609 */
v1 = this.m_sibling;
} // .end method
public void rescale ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 5 */
/* .param p1, "x" # I */
/* .param p2, "y" # I */
/* .param p3, "scale" # I */
/* .prologue */
/* .line 632 */
/* iget v4, p0, Lv/Vsprite;->m_width:I */
/* mul-int v1, p3, v4 */
/* .line 646 */
/* .local v1, "w":I */
/* iput p3, p0, Lv/Vsprite;->m_sscale:I */
/* .line 648 */
/* iget v4, p0, Lv/Vsprite;->m_xcenter:I */
/* mul-int v2, p3, v4 */
/* .line 649 */
/* .local v2, "xc":I */
/* iget v4, p0, Lv/Vsprite;->m_ycenter:I */
/* mul-int v3, p3, v4 */
/* .line 650 */
/* .local v3, "yc":I */
/* iget v4, p0, Lv/Vsprite;->m_height:I */
/* mul-int v0, p3, v4 */
/* .line 652 */
/* .local v0, "h":I */
/* sub-int/2addr p1, v2 */
/* .line 653 */
/* sub-int/2addr p2, v3 */
/* .line 658 */
/* iput p1, p0, Lv/Vsprite;->m_sx0f:I */
/* .line 659 */
/* iput p2, p0, Lv/Vsprite;->m_sy0f:I */
/* .line 663 */
/* add-int/lit16 p1, p1, 0x7fff */
/* .line 664 */
/* add-int/lit16 p2, p2, 0x7fff */
/* .line 666 */
/* shr-int/lit8 v4, p1, 0xf */
/* iput v4, p0, Lv/Vsprite;->m_sx0:I */
/* .line 667 */
/* shr-int/lit8 v4, p2, 0xf */
/* iput v4, p0, Lv/Vsprite;->m_sy0:I */
/* .line 669 */
/* add-int v4, p1, v1 */
/* shr-int/lit8 v4, v4, 0xf */
/* iput v4, p0, Lv/Vsprite;->m_sx1:I */
/* .line 670 */
/* add-int v4, p2, v0 */
/* shr-int/lit8 v4, v4, 0xf */
/* iput v4, p0, Lv/Vsprite;->m_sy1:I */
/* .line 671 */
return;
} // .end method
public void setAlpha ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "alpha" # I */
/* .prologue */
/* .line 674 */
/* iput p1, p0, Lv/Vsprite;->m_alpha:I */
/* .line 675 */
return;
} // .end method
public void setCenter ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* .param p1, "xc" # I */
/* .param p2, "yc" # I */
/* .prologue */
/* .line 678 */
/* iput p1, p0, Lv/Vsprite;->m_xcenter:I */
/* .line 679 */
/* iput p2, p0, Lv/Vsprite;->m_ycenter:I */
/* .line 680 */
return;
} // .end method
public void setColor ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "color" # I */
/* .prologue */
/* .line 683 */
/* iput p1, p0, Lv/Vsprite;->m_color:I */
/* .line 684 */
return;
} // .end method
public void setColorGradient ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "color" # I */
/* .prologue */
/* .line 687 */
/* iput p1, p0, Lv/Vsprite;->m_colorGradient:I */
/* .line 688 */
return;
} // .end method
public Boolean setExtent ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .param p1, "x0" # I */
/* .param p2, "y0" # I */
/* .param p3, "x1" # I */
/* .param p4, "y1" # I */
/* .prologue */
/* .line 692 */
/* iget v0, p0, Lv/Vsprite;->m_sx0:I */
/* if-ne p1, v0, :cond_0 */
/* iget v0, p0, Lv/Vsprite;->m_sy0:I */
/* if-ne p2, v0, :cond_0 */
/* iget v0, p0, Lv/Vsprite;->m_sx1:I */
/* if-ne p3, v0, :cond_0 */
/* iget v0, p0, Lv/Vsprite;->m_sy1:I */
/* if-eq p4, v0, :cond_1 */
/* .line 694 */
} // :cond_0
(( v.Vsprite ) p0 ).redraw ( ); // invoke-virtual {p0}, Lv/Vsprite;->redraw()V
/* .line 696 */
/* iput p1, p0, Lv/Vsprite;->m_sx0:I */
/* .line 697 */
/* iput p2, p0, Lv/Vsprite;->m_sy0:I */
/* .line 698 */
/* iput p3, p0, Lv/Vsprite;->m_sx1:I */
/* .line 699 */
/* iput p4, p0, Lv/Vsprite;->m_sy1:I */
/* .line 701 */
/* sub-int v0, p3, p1 */
/* iput v0, p0, Lv/Vsprite;->m_width:I */
/* .line 702 */
/* sub-int v0, p4, p2 */
/* iput v0, p0, Lv/Vsprite;->m_height:I */
/* .line 706 */
(( v.Vsprite ) p0 ).redraw ( ); // invoke-virtual {p0}, Lv/Vsprite;->redraw()V
/* .line 708 */
int v0 = 1; // const/4 v0, 0x1
/* .line 710 */
} // :goto_0
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void setId ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 714 */
/* iput p1, p0, Lv/Vsprite;->m_id:I */
/* .line 715 */
return;
} // .end method
public void setImage ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "libi" # I */
/* .prologue */
/* .line 718 */
v0 = this.m_lib;
(( v.Vsprite ) p0 ).setImage ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lv/Vsprite;->setImage(Lv/Vilib;I)V
/* .line 719 */
return;
} // .end method
public void setImage ( v.Vilib p0, Integer p1 ) {
/* .locals 2 */
/* .param p1, "lib" # Lv/Vilib; */
/* .param p2, "libi" # I */
/* .prologue */
/* .line 722 */
v1 = this.m_lib;
/* if-ne p1, v1, :cond_0 */
/* iget v1, p0, Lv/Vsprite;->m_libi:I */
/* if-eq p2, v1, :cond_1 */
/* .line 724 */
} // :cond_0
this.m_lib = p1;
/* .line 725 */
/* iput p2, p0, Lv/Vsprite;->m_libi:I */
/* .line 727 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 728 */
v1 = this.m_lib;
(( v.Vilib ) v1 ).loadPicture ( p2 ); // invoke-virtual {v1, p2}, Lv/Vilib;->loadPicture(I)Lv/Vpicture;
/* .line 729 */
/* .local v0, "pic":Lv/Vpicture; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 730 */
/* iget-short v1, v0, Lv/Vpicture;->m_width:S */
/* iput v1, p0, Lv/Vsprite;->m_width:I */
/* .line 731 */
/* iget-short v1, v0, Lv/Vpicture;->m_height:S */
/* iput v1, p0, Lv/Vsprite;->m_height:I */
/* .line 732 */
/* iget-short v1, v0, Lv/Vpicture;->m_xcenter:S */
/* iput v1, p0, Lv/Vsprite;->m_xcenter:I */
/* .line 733 */
/* iget-short v1, v0, Lv/Vpicture;->m_ycenter:S */
/* iput v1, p0, Lv/Vsprite;->m_ycenter:I */
/* .line 737 */
} // .end local v0 # "pic":Lv/Vpicture;
} // :cond_1
return;
} // .end method
public void setScale ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "scale" # I */
/* .prologue */
/* .line 740 */
/* iput p1, p0, Lv/Vsprite;->m_scale:I */
/* .line 741 */
return;
} // .end method
public void setWidthHeight ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* .param p1, "w" # I */
/* .param p2, "h" # I */
/* .prologue */
/* .line 754 */
/* iput p1, p0, Lv/Vsprite;->m_width:I */
/* .line 755 */
/* iput p2, p0, Lv/Vsprite;->m_height:I */
/* .line 756 */
return;
} // .end method
public void setWxyz ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 0 */
/* .param p1, "x" # I */
/* .param p2, "y" # I */
/* .param p3, "z" # I */
/* .prologue */
/* .line 759 */
/* iput p1, p0, Lv/Vsprite;->m_wx:I */
/* .line 760 */
/* iput p2, p0, Lv/Vsprite;->m_wy:I */
/* .line 761 */
/* iput p3, p0, Lv/Vsprite;->m_wz:I */
/* .line 762 */
return;
} // .end method
public void setXy ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* .param p1, "x" # I */
/* .param p2, "y" # I */
/* .prologue */
/* .line 772 */
/* iput p1, p0, Lv/Vsprite;->m_sx:I */
/* .line 773 */
/* iput p2, p0, Lv/Vsprite;->m_sy:I */
/* .line 774 */
return;
} // .end method
public void setXyi ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .param p1, "x" # I */
/* .param p2, "y" # I */
/* .prologue */
/* .line 766 */
/* shl-int/lit8 v0, p1, 0xf */
/* iput v0, p0, Lv/Vsprite;->m_sx:I */
/* .line 767 */
/* shl-int/lit8 v0, p2, 0xf */
/* iput v0, p0, Lv/Vsprite;->m_sy:I */
/* .line 768 */
return;
} // .end method
public void setZ ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "z" # I */
/* .prologue */
/* .line 781 */
/* iput p1, p0, Lv/Vsprite;->m_sz:I */
/* .line 782 */
return;
} // .end method
