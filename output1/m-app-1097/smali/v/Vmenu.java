public class v.Vmenu extends v.Vsprite {
	 /* .source "Vmenu.java" */
	 /* # static fields */
	 public static final Integer DIM;
	 static Integer m_colorDefault;
	 public static v.Vilib m_lib;
	 public static Boolean m_mouse;
	 /* # instance fields */
	 public Integer m_dim;
	 public v.Vsprite m_selected;
	 public Integer m_square;
	 Long m_timer;
	 /* # direct methods */
	 public v.Vmenu ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 424 */
		 /* invoke-direct {p0}, Lv/Vsprite;-><init>()V */
		 /* .line 425 */
		 /* iput v0, p0, Lv/Vmenu;->m_color:I */
		 /* .line 426 */
		 /* const/16 v0, 0x4000 */
		 /* iput v0, p0, Lv/Vmenu;->m_dim:I */
		 /* .line 427 */
		 /* const/16 v0, -0x3e8 */
		 /* iput v0, p0, Lv/Vmenu;->m_sz:I */
		 /* .line 428 */
		 return;
	 } // .end method
	 public static void setColorDefault ( Integer p0 ) {
		 /* .locals 0 */
		 /* .param p0, "c" # I */
		 /* .prologue */
		 /* .line 421 */
		 /* .line 422 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public v.Vtext add ( java.lang.String p0 ) {
		 /* .locals 3 */
		 /* .param p1, "s" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 28 */
		 int v1 = 0; // const/4 v1, 0x0
		 v0 = 		 (( java.lang.String ) p1 ).charAt ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C
		 /* .line 31 */
		 /* .local v0, "id":C */
		 /* sget-boolean v1, Lv/Vmenu;->m_mouse:Z */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 int v1 = 1; // const/4 v1, 0x1
			 v1 = 			 (( java.lang.String ) p1 ).charAt ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C
			 /* const/16 v2, 0x20 */
			 /* if-ne v1, v2, :cond_0 */
			 /* .line 32 */
			 int v1 = 2; // const/4 v1, 0x2
			 (( java.lang.String ) p1 ).substring ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
			 /* .line 34 */
		 } // :cond_0
		 (( v.Vmenu ) p0 ).add ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lv/Vmenu;->add(Ljava/lang/String;I)Lv/Vtext;
	 } // .end method
	 public v.Vtext add ( java.lang.String p0, Integer p1 ) {
		 /* .locals 2 */
		 /* .param p1, "s" # Ljava/lang/String; */
		 /* .param p2, "id" # I */
		 /* .prologue */
		 /* .line 39 */
		 /* new-instance v0, Lv/Vtext; */
		 /* invoke-direct {v0}, Lv/Vtext;-><init>()V */
		 /* .line 41 */
		 /* .local v0, "t":Lv/Vtext; */
		 (( v.Vtext ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Lv/Vtext;->setText(Ljava/lang/String;)V
		 /* .line 43 */
		 (( v.Vtext ) v0 ).setId ( p2 ); // invoke-virtual {v0, p2}, Lv/Vtext;->setId(I)V
		 /* .line 46 */
		 /* iget v1, p0, Lv/Vmenu;->m_height:I */
		 /* add-int/lit8 v1, v1, 0x3 */
		 /* iput v1, p0, Lv/Vmenu;->m_height:I */
		 /* .line 50 */
		 (( v.Vmenu ) p0 ).addSprite ( v0 ); // invoke-virtual {p0, v0}, Lv/Vmenu;->addSprite(Lv/Vsprite;)V
		 /* .line 53 */
		 /* iget v1, p0, Lv/Vmenu;->m_height:I */
		 /* add-int/lit8 v1, v1, 0x3 */
		 /* iput v1, p0, Lv/Vmenu;->m_height:I */
		 /* .line 57 */
	 } // .end method
	 public v.Vtext addIcon ( java.lang.String p0, Integer p1 ) {
		 /* .locals 1 */
		 /* .param p1, "s" # Ljava/lang/String; */
		 /* .param p2, "libi" # I */
		 /* .prologue */
		 /* .line 61 */
		 (( v.Vmenu ) p0 ).add ( p1 ); // invoke-virtual {p0, p1}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
		 /* .line 62 */
		 /* .local v0, "p":Lv/Vtext; */
		 (( v.Vtext ) v0 ).setImage ( p2 ); // invoke-virtual {v0, p2}, Lv/Vtext;->setImage(I)V
		 /* .line 63 */
	 } // .end method
	 public void addSprite ( v.Vsprite p0 ) {
		 /* .locals 1 */
		 /* .param p1, "ps" # Lv/Vsprite; */
		 /* .prologue */
		 /* .line 68 */
		 v0 = this.m_selected;
		 /* if-nez v0, :cond_0 */
		 /* .line 69 */
		 this.m_selected = p1;
		 /* .line 73 */
	 } // :goto_0
	 (( v.Vmenu ) p0 ).addBottom ( p1 ); // invoke-virtual {p0, p1}, Lv/Vmenu;->addBottom(Lv/Vsprite;)V
	 /* .line 74 */
	 return;
	 /* .line 71 */
} // :cond_0
/* const/16 v0, 0x4000 */
(( v.Vsprite ) p1 ).setAlpha ( v0 ); // invoke-virtual {p1, v0}, Lv/Vsprite;->setAlpha(I)V
} // .end method
public void addTouch ( Integer p0, Integer p1 ) {
/* .locals 6 */
/* .param p1, "id" # I */
/* .param p2, "libi" # I */
/* .prologue */
/* .line 80 */
/* iget v3, p0, Lv/Vmenu;->m_square:I */
/* .line 81 */
/* .local v3, "w":I */
/* move v1, v3 */
/* .line 83 */
/* .local v1, "h":I */
/* new-instance v0, Lv/Vsprite; */
/* invoke-direct {v0}, Lv/Vsprite;-><init>()V */
/* .line 84 */
/* .local v0, "box":Lv/Vsprite; */
/* iget v4, p0, Lv/Vmenu;->m_color:I */
/* iput v4, v0, Lv/Vsprite;->m_color:I */
/* .line 85 */
(( v.Vsprite ) v0 ).setId ( p1 ); // invoke-virtual {v0, p1}, Lv/Vsprite;->setId(I)V
/* .line 86 */
(( v.Vsprite ) v0 ).setWidthHeight ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Lv/Vsprite;->setWidthHeight(II)V
/* .line 88 */
(( v.Vmenu ) p0 ).addTail ( v0 ); // invoke-virtual {p0, v0}, Lv/Vmenu;->addTail(Lv/Vsprite;)V
/* .line 90 */
/* new-instance v2, Lv/Vsprite; */
/* invoke-direct {v2}, Lv/Vsprite;-><init>()V */
/* .line 91 */
/* .local v2, "p":Lv/Vsprite; */
(( v.Vsprite ) v2 ).setId ( p1 ); // invoke-virtual {v2, p1}, Lv/Vsprite;->setId(I)V
/* .line 92 */
v4 = v.Vmenu.m_lib;
(( v.Vsprite ) v2 ).setImage ( v4, p2 ); // invoke-virtual {v2, v4, p2}, Lv/Vsprite;->setImage(Lv/Vilib;I)V
/* .line 93 */
/* iget v4, v2, Lv/Vsprite;->m_width:I */
/* sub-int v4, v3, v4 */
/* shr-int/lit8 v4, v4, 0x1 */
/* iget v5, v2, Lv/Vsprite;->m_height:I */
/* sub-int v5, v1, v5 */
/* shr-int/lit8 v5, v5, 0x1 */
(( v.Vsprite ) v2 ).setXyi ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Lv/Vsprite;->setXyi(II)V
/* .line 94 */
/* iget v4, p0, Lv/Vmenu;->m_dim:I */
(( v.Vsprite ) v2 ).setAlpha ( v4 ); // invoke-virtual {v2, v4}, Lv/Vsprite;->setAlpha(I)V
/* .line 96 */
(( v.Vsprite ) v0 ).add ( v2 ); // invoke-virtual {v0, v2}, Lv/Vsprite;->add(Lv/Vsprite;)V
/* .line 97 */
return;
} // .end method
void deselect ( ) {
/* .locals 2 */
/* .prologue */
/* .line 100 */
(( v.Vmenu ) p0 ).getSelected ( ); // invoke-virtual {p0}, Lv/Vmenu;->getSelected()Lv/Vsprite;
/* .line 101 */
/* .local v0, "p":Lv/Vsprite; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 102 */
	 /* iget v1, p0, Lv/Vmenu;->m_dim:I */
	 (( v.Vsprite ) v0 ).setAlpha ( v1 ); // invoke-virtual {v0, v1}, Lv/Vsprite;->setAlpha(I)V
	 /* .line 107 */
} // :cond_0
return;
} // .end method
public void fade ( Integer p0, Integer p1 ) {
/* .locals 7 */
/* .param p1, "mousex" # I */
/* .param p2, "mousey" # I */
/* .prologue */
/* .line 111 */
if ( p1 != null) { // if-eqz p1, :cond_4
	 /* .line 113 */
	 v0 = this.m_child;
	 /* .local v0, "p":Lv/Vsprite; */
} // :goto_0
/* if-nez v0, :cond_1 */
/* .line 127 */
(( v.Vmenu ) p0 ).deselect ( ); // invoke-virtual {p0}, Lv/Vmenu;->deselect()V
/* .line 128 */
int v3 = 0; // const/4 v3, 0x0
this.m_selected = v3;
/* .line 146 */
} // .end local v0 # "p":Lv/Vsprite;
} // :cond_0
} // :goto_1
return;
/* .line 114 */
/* .restart local v0 # "p":Lv/Vsprite; */
} // :cond_1
/* iget v3, v0, Lv/Vsprite;->m_sx0:I */
/* if-lt p1, v3, :cond_3 */
/* iget v3, v0, Lv/Vsprite;->m_sx1:I */
/* if-gt p1, v3, :cond_3 */
/* iget v3, v0, Lv/Vsprite;->m_sy0:I */
/* if-lt p2, v3, :cond_3 */
/* iget v3, v0, Lv/Vsprite;->m_sy1:I */
/* if-gt p2, v3, :cond_3 */
/* .line 115 */
v3 = this.m_selected;
/* if-eq v0, v3, :cond_2 */
/* .line 116 */
(( v.Vmenu ) p0 ).deselect ( ); // invoke-virtual {p0}, Lv/Vmenu;->deselect()V
/* .line 117 */
this.m_selected = v0;
/* .line 118 */
(( v.Vmenu ) p0 ).select ( ); // invoke-virtual {p0}, Lv/Vmenu;->select()V
/* .line 121 */
} // :cond_2
/* const v3, 0x8000 */
/* iput v3, v0, Lv/Vsprite;->m_alpha:I */
/* .line 122 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v3 */
/* iput-wide v3, p0, Lv/Vmenu;->m_timer:J */
/* .line 113 */
} // :cond_3
v0 = this.m_sibling;
/* .line 132 */
} // .end local v0 # "p":Lv/Vsprite;
} // :cond_4
/* iget v3, p0, Lv/Vmenu;->m_square:I */
if ( v3 != null) { // if-eqz v3, :cond_0
v3 = this.m_selected;
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 134 */
v0 = this.m_selected;
/* .line 135 */
/* .restart local v0 # "p":Lv/Vsprite; */
v3 = this.m_child;
if ( v3 != null) { // if-eqz v3, :cond_5
/* .line 136 */
v0 = this.m_child;
/* .line 138 */
} // :cond_5
/* iget v3, v0, Lv/Vsprite;->m_alpha:I */
/* iget v4, p0, Lv/Vmenu;->m_dim:I */
/* if-le v3, v4, :cond_0 */
/* .line 141 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v3 */
/* iget-wide v5, p0, Lv/Vmenu;->m_timer:J */
/* sub-long v1, v3, v5 */
/* .line 142 */
/* .local v1, "t":J */
/* const-wide/16 v3, 0xc8 */
/* cmp-long v3, v1, v3 */
/* if-gtz v3, :cond_6 */
/* const-wide/16 v3, 0x0 */
/* cmp-long v3, v1, v3 */
/* if-gez v3, :cond_0 */
/* .line 143 */
} // :cond_6
/* iget v3, p0, Lv/Vmenu;->m_dim:I */
/* iput v3, v0, Lv/Vsprite;->m_alpha:I */
} // .end method
public v.Vsprite getSelected ( ) {
/* .locals 2 */
/* .prologue */
/* .line 151 */
v0 = this.m_selected;
/* .line 154 */
/* .local v0, "p":Lv/Vsprite; */
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = this.m_child;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 155 */
v0 = this.m_child;
/* .line 156 */
} // :goto_0
v1 = this.m_sibling;
/* if-nez v1, :cond_1 */
/* .line 160 */
} // :cond_0
/* .line 157 */
} // :cond_1
v0 = this.m_sibling;
} // .end method
public v.Vtext getSelectedText ( ) {
/* .locals 3 */
/* .prologue */
/* .line 166 */
(( v.Vmenu ) p0 ).getSelected ( ); // invoke-virtual {p0}, Lv/Vmenu;->getSelected()Lv/Vsprite;
/* .line 168 */
/* .local v0, "p":Lv/Vsprite; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v1, v0, Lv/Vsprite;->m_libi:I */
int v2 = -1; // const/4 v2, -0x1
/* if-eq v1, v2, :cond_1 */
/* .line 169 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 172 */
} // .end local v0 # "p":Lv/Vsprite;
} // :goto_0
/* .restart local v0 # "p":Lv/Vsprite; */
} // :cond_1
/* check-cast v0, Lv/Vtext; */
} // .end local v0 # "p":Lv/Vsprite;
/* move-object v1, v0 */
} // .end method
public Object key ( Object p0, Integer p1, Integer p2 ) {
/* .locals 6 */
/* .param p1, "key" # C */
/* .param p2, "mousex" # I */
/* .param p3, "mousey" # I */
/* .prologue */
int v5 = 5; // const/4 v5, 0x5
int v4 = 0; // const/4 v4, 0x0
/* .line 181 */
/* if-nez p1, :cond_0 */
/* .line 183 */
(( v.Vmenu ) p0 ).fade ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Lv/Vmenu;->fade(II)V
/* move v3, v4 */
/* .line 281 */
} // :goto_0
/* .line 187 */
} // :cond_0
/* if-ne p1, v5, :cond_3 */
/* if-nez p2, :cond_1 */
if ( p3 != null) { // if-eqz p3, :cond_3
/* .line 191 */
} // :cond_1
/* iget v3, p0, Lv/Vmenu;->m_square:I */
if ( v3 != null) { // if-eqz v3, :cond_7
/* .line 195 */
v0 = this.m_child;
/* .line 196 */
/* .local v0, "p":Lv/Vsprite; */
} // :goto_1
/* if-nez v0, :cond_5 */
/* .line 205 */
(( v.Vmenu ) p0 ).deselect ( ); // invoke-virtual {p0}, Lv/Vmenu;->deselect()V
/* .line 230 */
} // .end local v0 # "p":Lv/Vsprite;
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
/* .line 233 */
} // :cond_3
/* iget v3, p0, Lv/Vmenu;->m_square:I */
/* if-nez v3, :cond_11 */
/* .line 234 */
int v3 = 3; // const/4 v3, 0x3
/* if-eq p1, v3, :cond_9 */
/* .line 247 */
int v3 = 4; // const/4 v3, 0x4
/* if-eq p1, v3, :cond_c */
/* .line 258 */
/* if-eq p1, v5, :cond_4 */
/* const/16 v3, 0xa */
/* if-ne p1, v3, :cond_f */
/* .line 259 */
} // :cond_4
v3 = this.m_selected;
if ( v3 != null) { // if-eqz v3, :cond_11
/* .line 260 */
v3 = this.m_selected;
/* iget v3, v3, Lv/Vsprite;->m_id:I */
/* int-to-char v3, v3 */
/* .line 197 */
/* .restart local v0 # "p":Lv/Vsprite; */
} // :cond_5
/* iget v3, v0, Lv/Vsprite;->m_sx0:I */
/* if-lt p2, v3, :cond_6 */
/* iget v3, v0, Lv/Vsprite;->m_sx1:I */
/* if-gt p2, v3, :cond_6 */
/* iget v3, v0, Lv/Vsprite;->m_sy0:I */
/* if-lt p3, v3, :cond_6 */
/* iget v3, v0, Lv/Vsprite;->m_sy1:I */
/* if-gt p3, v3, :cond_6 */
/* .line 198 */
(( v.Vmenu ) p0 ).deselect ( ); // invoke-virtual {p0}, Lv/Vmenu;->deselect()V
/* .line 199 */
this.m_selected = v0;
/* .line 200 */
(( v.Vmenu ) p0 ).select ( ); // invoke-virtual {p0}, Lv/Vmenu;->select()V
/* .line 201 */
/* iget v3, v0, Lv/Vsprite;->m_id:I */
/* int-to-char v3, v3 */
/* .line 203 */
} // :cond_6
v0 = this.m_sibling;
/* .line 207 */
} // .end local v0 # "p":Lv/Vsprite;
} // :cond_7
/* iget v3, p0, Lv/Vmenu;->m_sx0:I */
/* if-lt p2, v3, :cond_2 */
/* iget v3, p0, Lv/Vmenu;->m_sx1:I */
/* if-ge p2, v3, :cond_2 */
/* iget v3, p0, Lv/Vmenu;->m_sy0:I */
/* if-lt p3, v3, :cond_2 */
/* iget v3, p0, Lv/Vmenu;->m_sy1:I */
/* if-ge p3, v3, :cond_2 */
/* .line 209 */
v0 = this.m_child;
/* .restart local v0 # "p":Lv/Vsprite; */
} // :goto_2
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 211 */
/* iget v3, v0, Lv/Vsprite;->m_sy0:I */
/* if-lt p3, v3, :cond_8 */
/* iget v3, v0, Lv/Vsprite;->m_sy1:I */
/* if-ge p3, v3, :cond_8 */
/* .line 213 */
(( v.Vmenu ) p0 ).deselect ( ); // invoke-virtual {p0}, Lv/Vmenu;->deselect()V
/* .line 214 */
this.m_selected = v0;
/* .line 215 */
(( v.Vmenu ) p0 ).select ( ); // invoke-virtual {p0}, Lv/Vmenu;->select()V
/* .line 222 */
/* iget v3, v0, Lv/Vsprite;->m_id:I */
/* int-to-char v3, v3 */
/* .line 209 */
} // :cond_8
v0 = this.m_sibling;
/* .line 236 */
} // .end local v0 # "p":Lv/Vsprite;
} // :cond_9
(( v.Vmenu ) p0 ).deselect ( ); // invoke-virtual {p0}, Lv/Vmenu;->deselect()V
/* .line 237 */
v1 = this.m_child;
/* .line 238 */
/* .local v1, "prior":Lv/Vsprite; */
v0 = this.m_sibling;
/* .line 239 */
/* .restart local v0 # "p":Lv/Vsprite; */
} // :goto_3
v3 = this.m_selected;
/* if-eq v0, v3, :cond_a */
/* if-nez v0, :cond_b */
/* .line 243 */
} // :cond_a
this.m_selected = v1;
/* .line 244 */
(( v.Vmenu ) p0 ).select ( ); // invoke-virtual {p0}, Lv/Vmenu;->select()V
/* move v3, v4 */
/* .line 245 */
/* goto/16 :goto_0 */
/* .line 240 */
} // :cond_b
/* move-object v1, v0 */
/* .line 241 */
v0 = this.m_sibling;
/* .line 249 */
} // .end local v0 # "p":Lv/Vsprite;
} // .end local v1 # "prior":Lv/Vsprite;
} // :cond_c
v3 = this.m_selected;
if ( v3 != null) { // if-eqz v3, :cond_d
/* .line 250 */
(( v.Vmenu ) p0 ).deselect ( ); // invoke-virtual {p0}, Lv/Vmenu;->deselect()V
/* .line 251 */
v3 = this.m_selected;
v3 = this.m_sibling;
this.m_selected = v3;
/* .line 253 */
} // :cond_d
v3 = this.m_selected;
/* if-nez v3, :cond_e */
/* .line 254 */
v3 = this.m_child;
this.m_selected = v3;
/* .line 255 */
} // :cond_e
(( v.Vmenu ) p0 ).select ( ); // invoke-virtual {p0}, Lv/Vmenu;->select()V
/* move v3, v4 */
/* .line 256 */
/* goto/16 :goto_0 */
/* .line 262 */
} // :cond_f
int v3 = 1; // const/4 v3, 0x1
/* if-eq p1, v3, :cond_10 */
int v3 = 2; // const/4 v3, 0x2
/* if-ne p1, v3, :cond_11 */
/* .line 263 */
} // :cond_10
(( v.Vmenu ) p0 ).getSelectedText ( ); // invoke-virtual {p0}, Lv/Vmenu;->getSelectedText()Lv/Vtext;
/* .line 264 */
/* .local v2, "pt":Lv/Vtext; */
if ( v2 != null) { // if-eqz v2, :cond_11
v3 = this.m_s;
/* const/16 v4, 0x3a */
v3 = (( java.lang.String ) v3 ).indexOf ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(I)I
int v4 = -1; // const/4 v4, -0x1
/* if-eq v3, v4, :cond_11 */
/* .line 265 */
v3 = this.m_selected;
/* iget v3, v3, Lv/Vsprite;->m_id:I */
/* int-to-char v3, v3 */
/* goto/16 :goto_0 */
/* .line 269 */
} // .end local v2 # "pt":Lv/Vtext;
} // :cond_11
if ( p1 != null) { // if-eqz p1, :cond_12
/* .line 271 */
v0 = this.m_child;
/* .restart local v0 # "p":Lv/Vsprite; */
} // :goto_4
/* if-nez v0, :cond_13 */
} // .end local v0 # "p":Lv/Vsprite;
} // :cond_12
/* move v3, p1 */
/* .line 281 */
/* goto/16 :goto_0 */
/* .line 272 */
/* .restart local v0 # "p":Lv/Vsprite; */
} // :cond_13
/* iget v3, v0, Lv/Vsprite;->m_id:I */
/* if-ne v3, p1, :cond_14 */
/* .line 273 */
(( v.Vmenu ) p0 ).deselect ( ); // invoke-virtual {p0}, Lv/Vmenu;->deselect()V
/* .line 274 */
this.m_selected = v0;
/* .line 275 */
(( v.Vmenu ) p0 ).select ( ); // invoke-virtual {p0}, Lv/Vmenu;->select()V
/* move v3, p1 */
/* .line 276 */
/* goto/16 :goto_0 */
/* .line 271 */
} // :cond_14
v0 = this.m_sibling;
} // .end method
public void resize ( Integer p0, Integer p1 ) {
/* .locals 14 */
/* .param p1, "swidth" # I */
/* .param p2, "sheight" # I */
/* .prologue */
/* .line 286 */
/* iget v2, p0, Lv/Vmenu;->m_square:I */
/* .line 287 */
/* .local v2, "msq":I */
/* if-nez v2, :cond_1 */
/* .line 363 */
} // :cond_0
return;
/* .line 291 */
} // :cond_1
int v3 = 3; // const/4 v3, 0x3
/* .line 294 */
/* .local v3, "n":I */
/* const/16 v5, 0x28 */
/* .line 296 */
/* .local v5, "sq":I */
/* div-int v0, p2, v3 */
/* .line 299 */
/* .local v0, "h":I */
/* shl-int/lit8 v12, v5, 0x2 */
/* sub-int v12, p1, v12 */
/* div-int/lit8 v12, v12, 0x3 */
/* add-int v6, v5, v12 */
/* .line 300 */
/* .local v6, "w":I */
/* sub-int v12, v6, v5 */
/* shr-int/lit8 v9, v12, 0x1 */
/* .line 302 */
/* .local v9, "xpad":I */
/* if-le v0, v6, :cond_2 */
/* .line 303 */
/* move v0, v6 */
/* .line 305 */
} // :cond_2
/* sub-int v12, v0, v5 */
/* shr-int/lit8 v11, v12, 0x1 */
/* .line 308 */
/* .local v11, "ypad":I */
/* neg-int v8, v9 */
/* .line 309 */
/* .local v8, "x":I */
int v10 = 0; // const/4 v10, 0x0
/* .line 313 */
/* .local v10, "y":I */
int v12 = 0; // const/4 v12, 0x0
/* iput v12, p0, Lv/Vmenu;->m_width:I */
/* .line 314 */
/* mul-int v12, v3, v0 */
/* sub-int/2addr v12, v11 */
/* iput v12, p0, Lv/Vmenu;->m_height:I */
/* .line 317 */
/* sub-int v12, v6, v2 */
/* shr-int/lit8 v7, v12, 0x1 */
/* .line 318 */
/* .local v7, "w0":I */
/* sub-int v12, v0, v2 */
/* shr-int/lit8 v1, v12, 0x1 */
/* .line 322 */
/* .local v1, "h0":I */
v4 = this.m_child;
/* .line 323 */
/* .local v4, "p":Lv/Vsprite; */
} // :goto_0
if ( v4 != null) { // if-eqz v4, :cond_3
int v12 = 1; // const/4 v12, 0x1
/* if-gt v3, v12, :cond_4 */
/* .line 350 */
} // :cond_3
} // :goto_1
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 351 */
/* add-int v12, v8, v7 */
/* add-int v13, v10, v1 */
(( v.Vsprite ) v4 ).setXyi ( v12, v13 ); // invoke-virtual {v4, v12, v13}, Lv/Vsprite;->setXyi(II)V
/* .line 360 */
v4 = this.m_sibling;
/* .line 361 */
/* add-int/2addr v8, v6 */
/* .line 324 */
} // :cond_4
/* add-int v12, v8, v7 */
/* add-int v13, v10, v1 */
(( v.Vsprite ) v4 ).setXyi ( v12, v13 ); // invoke-virtual {v4, v12, v13}, Lv/Vsprite;->setXyi(II)V
/* .line 335 */
v4 = this.m_sibling;
/* .line 336 */
/* add-int v12, p1, v9 */
/* sub-int/2addr v12, v6 */
/* add-int/2addr v12, v7 */
/* add-int v13, v10, v1 */
(( v.Vsprite ) v4 ).setXyi ( v12, v13 ); // invoke-virtual {v4, v12, v13}, Lv/Vsprite;->setXyi(II)V
/* .line 344 */
v4 = this.m_sibling;
/* .line 345 */
/* add-int/2addr v10, v0 */
/* .line 346 */
/* add-int/lit8 v3, v3, -0x1 */
} // .end method
public void select ( ) {
/* .locals 3 */
/* .prologue */
/* .line 366 */
v1 = this.m_selected;
/* if-nez v1, :cond_0 */
/* .line 367 */
v1 = this.m_child;
this.m_selected = v1;
/* .line 372 */
} // :cond_0
(( v.Vmenu ) p0 ).getSelected ( ); // invoke-virtual {p0}, Lv/Vmenu;->getSelected()Lv/Vsprite;
/* .line 373 */
/* .local v0, "p":Lv/Vsprite; */
/* if-nez v0, :cond_1 */
/* .line 378 */
} // :goto_0
return;
/* .line 376 */
} // :cond_1
/* const v1, 0x8000 */
(( v.Vsprite ) v0 ).setAlpha ( v1 ); // invoke-virtual {v0, v1}, Lv/Vsprite;->setAlpha(I)V
/* .line 377 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v1 */
/* iput-wide v1, p0, Lv/Vmenu;->m_timer:J */
} // .end method
public void select ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 381 */
v0 = this.m_child;
/* .local v0, "p":Lv/Vsprite; */
} // :goto_0
/* if-nez v0, :cond_0 */
/* .line 392 */
return;
/* .line 382 */
} // :cond_0
/* iget v1, v0, Lv/Vsprite;->m_id:I */
/* if-ne v1, p1, :cond_2 */
/* .line 383 */
v1 = this.m_selected;
/* if-eq v0, v1, :cond_2 */
/* .line 384 */
v1 = this.m_selected;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 385 */
(( v.Vmenu ) p0 ).deselect ( ); // invoke-virtual {p0}, Lv/Vmenu;->deselect()V
/* .line 386 */
} // :cond_1
this.m_selected = v0;
/* .line 388 */
(( v.Vmenu ) p0 ).select ( ); // invoke-virtual {p0}, Lv/Vmenu;->select()V
/* .line 381 */
} // :cond_2
v0 = this.m_sibling;
} // .end method
public void selectOrdinal ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "idx" # I */
/* .prologue */
/* .line 395 */
v2 = this.m_selected;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 396 */
(( v.Vmenu ) p0 ).deselect ( ); // invoke-virtual {p0}, Lv/Vmenu;->deselect()V
/* .line 398 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 399 */
/* .local v0, "i":I */
v1 = this.m_child;
/* .local v1, "p":Lv/Vsprite; */
} // :goto_0
/* if-nez v1, :cond_1 */
/* .line 407 */
} // :goto_1
return;
/* .line 400 */
} // :cond_1
/* if-ne v0, p1, :cond_2 */
/* .line 401 */
this.m_selected = v1;
/* .line 402 */
(( v.Vmenu ) p0 ).select ( ); // invoke-virtual {p0}, Lv/Vmenu;->select()V
/* .line 405 */
} // :cond_2
/* add-int/lit8 v0, v0, 0x1 */
/* .line 399 */
v1 = this.m_sibling;
} // .end method
public Integer selectedOrdinal ( ) {
/* .locals 3 */
/* .prologue */
/* .line 411 */
int v0 = 0; // const/4 v0, 0x0
/* .line 412 */
/* .local v0, "i":I */
v1 = this.m_child;
/* .local v1, "p":Lv/Vsprite; */
} // :goto_0
/* if-nez v1, :cond_1 */
/* .line 417 */
} // :cond_0
/* .line 413 */
} // :cond_1
v2 = this.m_selected;
/* if-eq v1, v2, :cond_0 */
/* .line 415 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 412 */
v1 = this.m_sibling;
} // .end method
