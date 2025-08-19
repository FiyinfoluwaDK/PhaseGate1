import unittest
from Task4 import fuelChecker

class TestFuelChecker(unittest.TestCase):

	def test_exact_distance(self):
		self.assertEqual(fuelChecker(2), "True")  

	def test_insufficient_fuel(self):
		self.assertEqual(fuelChecker(1), "False")  

	def test_excess_fuel(self):
		self.assertEqual(fuelChecker(3), "False")  

	def test_zero_fuel(self):
		self.assertEqual(fuelChecker(0), "False") 

	def test_negative_fuel(self):
		self.assertEqual(fuelChecker(-2), "False")  

	def test_float_fuel_exact(self):
		self.assertEqual(fuelChecker(2.0), "True")  

	def test_float_fuel_inexact(self):
		self.assertEqual(fuelChecker(1.5), "False")  

if __name__ == '__main__':
    unittest.main()