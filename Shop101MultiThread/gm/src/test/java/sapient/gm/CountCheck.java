package sapient.gm;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sapient.gm.com.customer.*;
import sapient.gm.com.shop.repo.*;
import sapient.gm.com.shop.product.*;

public class CountCheck {

	private final AtomicInteger count = new AtomicInteger();
	
	public void initialize(int number) {
		count.set(number);
	}
	
	public void addOne() {
		count.incrementAndGet();
	}
	
	public int getCount() {
		return count.get();
	}
}
