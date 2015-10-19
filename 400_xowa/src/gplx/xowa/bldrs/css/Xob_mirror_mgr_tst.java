/*
XOWA: the XOWA Offline Wiki Application
Copyright (C) 2012 gnosygnu@gmail.com

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package gplx.xowa.bldrs.css; import gplx.*; import gplx.xowa.*; import gplx.xowa.bldrs.*;
import org.junit.*;
import gplx.xowa.files.downloads.*;
public class Xob_mirror_mgr_tst {
	@Before public void init() {fxt.Clear();} private Xob_mirror_mgr_fxt fxt = new Xob_mirror_mgr_fxt();
	@Test   public void Download_1() {
		fxt.Fsys().Init_fil("mem/http/enwiki/file/a.png");
		fxt.Fsys().Init_fil("mem/http/enwiki/wiki/Main_Page", "url('//enwiki/wiki/a.png')");
//			fxt.Test_css();
//			fxt.Fsys().Test_fil("url('//enwiki/wiki/a.png')", "url('enwiki/wiki/a.png')");	// remove "//"
//			fxt.Fsys().Test_fil("mem/fsys/enwiki/file/a.png");
	}
}
class Xob_mirror_mgr_fxt {
//		private Xob_mirror_mgr mirror_mgr;
	public Io_fsys_fxt Fsys() {return fsys;} private final Io_fsys_fxt fsys = new Io_fsys_fxt();
	public void Clear() {
		fsys.Clear();
//			mirror_mgr = new Xob_mirror_mgr(Gfo_usr_dlg_.Noop, new Xof_download_wkr_test(), Bry_.new_a7("mem/http/enwiki"), Bry_.new_a7("mem/http/enwiki/wiki/Main_Page"), Io_url_.new_dir_("mem/fsys"));
	}
	public void Test_css(String raw, String expd) {
//			byte[] raw_bry = Bry_.new_u8(raw);
//			mirror_mgr.Exec();
	}
}
class Io_fsys_fxt {
	public void Clear() {
		Io_mgr.Instance.InitEngine_mem();
	}
	public void Init_fil(String url_str) {
		Io_url url = Io_url_.new_fil_(url_str);
		Init_fil(url, url.NameAndExt());
	}
	public void Init_fil(String url_str, String text) {Init_fil(Io_url_.new_fil_(url_str), text);}
	public void Init_fil(Io_url url, String text) {
		Io_mgr.Instance.SaveFilStr(url, text);
	}
	public void Test_fil(String url_str) {
		Io_url url = Io_url_.new_fil_(url_str);
		Test_fil(url, url.NameAndExt());
	}
	public void Test_fil(String url, String expd) {Test_fil(Io_url_.new_fil_(url), expd);}
	public void Test_fil(Io_url url, String expd) {
		Tfds.Eq_str_lines(expd, Io_mgr.Instance.LoadFilStr(url));
	}
}
