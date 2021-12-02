package hotel.HotelManagement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class test {
	MainRun mr = new MainRun();
	Search search = new Search();
	InHotel ih = new InHotel();
	
	@Test
	public void search_ini_801_is_Linda(){
		mr.iniRooms();
		String tmp = ih.in(802,"Linda");
		assertEquals("Linda成功入住802房间！",tmp);
		
	}

}
